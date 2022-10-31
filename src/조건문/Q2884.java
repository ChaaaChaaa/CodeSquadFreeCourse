package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2884 {
    private static int inputTime;
    private static int inputSecond;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        inputTime = Integer.parseInt(str[0]);
        inputSecond = Integer.parseInt(str[1]);
        getResult();
        System.out.println(inputTime + " " + inputSecond);
    }

    public static void getResult() {
        if (inputSecond < 45) {
            if (inputTime == 0) {
                inputTime = 23;
                inputSecond += 15;
                return;
            }

            inputTime--;
            inputSecond += 15;

        } else {
            inputSecond -= 45;
        }
    }
}

