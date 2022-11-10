package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q12910 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> ansList = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                ansList.add(num);
            }
        }

        if (ansList.size() == 0) {
            ansList.add(-1);
        }

        int[] answer = new int[ansList.size()];

        for (int i = 0; i < ansList.size(); i++) {
            answer[i] = ansList.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
    /*
    def solution(arr, divisor):
    answer = []

    for i in arr:
        if i%divisor == 0:
            answer.append(i)
    if len(answer) == 0:
        answer.append(-1)

    answer.sort()
    return answer
     */

