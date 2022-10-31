package 조건문;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputX = Integer.parseInt(br.readLine());
        int inputY = Integer.parseInt(br.readLine());
        System.out.println(getPosition(inputX, inputY));
    }

    public static int getPosition(int inputX, int inputY) {
        if (inputX > 0 && inputY > 0) {
            return 1;
        } else if (inputX < 0 && inputY < 0) {
            return 3;
        } else if (inputX > 0 && inputY < 0) {
            return 4;
        } else if (inputX < 0 && inputY > 0) {
            return 2;
        }
        return 0;
    }
}
