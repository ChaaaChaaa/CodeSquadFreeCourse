package 조건문;

import java.util.Scanner;

public class Q9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        if(a>=90){
            System.out.println("A");
            return;
        }
        if(a>=80){
            System.out.println("B");
            return;
        }
        if(a>=70){
            System.out.println("C");
            return;
        }

        if(a>=60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }

    }
}
