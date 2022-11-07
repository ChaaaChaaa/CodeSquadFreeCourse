package 알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class Q2920 {
    private static final String[] arrA = {"1", "2", "3", "4", "5", "6", "7", "8"};
    private static final String[] arrD = {"8", "7", "6", "5", "4", "3", "2", "1"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");

        if (Arrays.equals(strArr, arrA)) {
            System.out.println("ascending");
        } else if (Arrays.equals(strArr, arrD)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
