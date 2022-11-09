package concert;

import java.util.ArrayList;
import java.util.List;

public class ConcertSystem {

    public static void main(String[] args) {
        String [][] seatList = new String [3][10];
        List<Person> reservationList = new ArrayList<>();
        boolean isTurnOn = true;
        ResultView.initSeat(seatList);


        while (isTurnOn){
            int inputMenuNumber = InputView.showMenu();
            switch (inputMenuNumber){
                case 1:
                    int seatClass = InputView.inputSeatClass();
                    ResultView.printSeatList(seatClass,seatList);
                    String personName = InputView.inputName();
                    int seatPosition = InputView.inputSeatPosition();
                    Person person = new Person(seatClass,seatPosition,personName,seatList);
                    reservationList.add(person);
                    break;

                case 2:
                    ResultView.getReservationList(seatList);
                    ResultView.printResult();
                    break;

                case 3:
                    Cancellation cancellation = new Cancellation(seatList);
                    int inputCancelClass = InputView.inputSeatClass();
                    ResultView.printSeatList(inputCancelClass,seatList);
                    String inputCancelName = InputView.inputName();
                    cancellation.cancelSeat(reservationList,inputCancelName,seatList);
                    System.out.println();
                    break;

                case 4:
                    isTurnOn = false;
                    break;
            }
        }
    }
}
