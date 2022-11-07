package 알고리즘;

import java.util.Scanner;

public class Q2920_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] strArr = sc.nextLine().replace(" ","").toCharArray();
        String result = "";
        for(int i=0; i<strArr.length-1; i++){
            if(strArr[i+1]-'0' == strArr[i]-'0'+1){
                result = "ascending";
            }
            else if(strArr[i+1]-'0'  == strArr[i]-'0'-1){
                result = "descending";
            }else{
                result = "mixed";
                break;
            }
        }
        System.out.print(result);
    }
}
