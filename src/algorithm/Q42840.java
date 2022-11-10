package algorithm;

import java.util.ArrayList;

public class Q42840 {
    private static final int[] person1 = {1, 2, 3, 4, 5};
    private static final int[] person2 = {2, 1, 2, 3, 2, 4};
    private static final int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    private static int[] ans = {};

    public int[] solution(int[] answers) {
        int ans1 = 0;
        int ans2 = 0;
        int ans3 = 0;

        for (int i = 0; i < ans.length; i++) {
            if (answers[i] == person1[i % person1.length]) {
                ans1++;
            }
            if (answers[i] == person2[i % person2.length]) {
                ans2++;
            }
            if (answers[i] == person3[i % person3.length]) {
                ans3++;
            }
        }

        int max = Math.max(Math.max(ans1, ans2), ans3);
        ArrayList<Integer> list = new ArrayList<>();
        if (max == ans1) {
            list.add(1);
        }
        if (max == ans2) {
            list.add(2);
        }
        if (max == ans3) {
            list.add(3);
        }

        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }

    public static void main(String[] args) {
        Q42840 q42840 = new Q42840();
        int [] arr = {1,2,3,4,5};
        q42840.solution(arr);
    }
}

/*
def solution(answers):
    pattern1 = [1, 2, 3, 4, 5]
    pattern2 = [2, 1, 2, 3, 2, 4, 2, 5]
    pattern3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    score = [0, 0, 0]
    result = []

    for index, ans in enumerate(answers):
        if ans == pattern1[index % len(pattern1)]:
            score[0] += 1
        if ans == pattern2[index % len(pattern2)]:
            score[1] += 1
        if ans == pattern3[index % len(pattern3)]:
            score[2] += 1

    for index, s in enumerate(score):
        if s == max(score):
            result.append(index + 1)

    return result
 */
