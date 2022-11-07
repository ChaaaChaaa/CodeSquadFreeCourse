package 알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        String [] quizes = new String[count];

        for (int i = 0; i < count; i++) {
            quizes[i] = br.readLine();
        }

        for (int i = 0; i < quizes.length; i++) {
            getQuizResult(quizes[i].toCharArray());
        }
    }

    private static void getQuizResult(char[] oxQuiz) {
        int result = 0, cnt = 0;
        for (char c : oxQuiz) {
            if (c == 'O') {
                cnt++;
                result += cnt;
            } else {
                cnt = 0;
            }
        }
        System.out.println(result);
    }
}
