package 별찍기;

import java.util.Arrays;
import java.util.Scanner;


public class 별찍기10 {
    private static final Scanner sc = new Scanner(System.in);
    private static char[][] starMap;

    public static void main(String[] args) {
        int num = sc.nextInt();
        starMap = new char[num][num];
        for (int i = 0; i < num; i++) {
            Arrays.fill(starMap[i], ' ');
        }
        starFactorial(0, 0, num);

        for (int i = 0; i < num; i++) {
            System.out.println(starMap[i]);

        }
    }
    public static void starFactorial(int x, int y, int num){
        if(num ==1){
            starMap[x][y] = '*';
            return;
        }

        int m = num/3;
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==1 && j==1){
                    continue;
                }
                starFactorial(x+m*i,y+m*j,m);
            }
        }
    }

}
