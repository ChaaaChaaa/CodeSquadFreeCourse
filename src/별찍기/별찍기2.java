package 별찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class 별찍기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());


        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                System.out.print(" ");
            }
            for (int k = num - i; k <= num; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}