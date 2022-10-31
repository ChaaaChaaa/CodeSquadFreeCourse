package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2525 {
    private static int inputTime;
    private static int inputSecond;
    private static int inputOvenTime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        inputTime = Integer.parseInt(str[0]);
        inputSecond = Integer.parseInt(str[1]);
        inputOvenTime = Integer.parseInt(br.readLine());
        getResult();
        System.out.println(inputTime + " " + inputSecond);
    }

    public static void getResult() {
        inputSecond += inputOvenTime % 60;
        inputTime += inputOvenTime / 60;

        if (inputSecond >= 60) {
            inputTime += 1;
            inputSecond -= 60;
        }
        if (inputTime >= 24) {
            inputTime -= 24;
            return;
        }
    }
}

