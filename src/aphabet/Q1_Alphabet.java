package aphabet;

import java.util.Arrays;

public class Q1_Alphabet {
    public static void main(String[] args) {
        char [] alphabetArr = new char[26];
        String [] alphabetStringArr = new String[26];

        for(int i=0,num=65; i<alphabetArr.length; i++,num++){
            alphabetArr[i] = (char)num;
            alphabetStringArr[i] = String.valueOf(alphabetArr[i]);
        }

        System.out.println(Arrays.toString(alphabetStringArr));
    }
}
