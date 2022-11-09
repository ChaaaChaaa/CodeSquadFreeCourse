package concert;

import java.util.Scanner;

public class InputView {
    private static final Scanner sc = new Scanner(System.in);

    public static int showMenu(){
        System.out.print("예약:1,  조회:2,  취소:3,  끝내기:4  ");
        return sc.nextInt();
    }

    public static int inputSeatClass(){
        System.out.print("좌석 구분 S(1), A(2), B(3)");
        return sc.nextInt()-1;
    }

    public static String inputName(){
        System.out.print("이름");
        return sc.next();
    }

    public static int inputSeatPosition(){
        System.out.print("번호");
        return sc.nextInt()-1;
    }
}
