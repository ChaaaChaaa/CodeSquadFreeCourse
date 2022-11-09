package concert;

public class ResultView {

    public static void initSeat(String[][] seatList){
        for(int i=0; i<3; i++){
            for(int j=0; j<10; j++){
                seatList[i][j] = "___";
            }
        }
    }

    public static void printSeatList(int inputSeatClass,String[][] seatList){
        for(int i=0; i<10; i++){
            System.out.print(seatList[inputSeatClass][i]+" ");
        }

        System.out.println();
    }

    public static void getReservationList(String [][] seatList){
        for(int i=0; i<3; i++){
            for(int j=0; j<10; j++){
                if(seatList[i][j] != null){
                    System.out.print(seatList[i][j]+" ");
                }else{
                    System.out.print("___ ");
                }
            }
            System.out.println();
        }
    }

    public static void printResult(){
        System.out.println("조회를 완료하였습니다.");
    }
}
