package concert;

public class Person {
    int seatClass;
    int seatPosition;
    String name;
    String[][] seatList;

    Person(int seatClass,int seatPosition, String name,String[][] seatList){
        this.seatClass = seatClass;
        this.seatPosition = seatPosition;
        this.name = name;
        this.seatList = seatList;
        setReservationList();
    }

    public void setReservationList(){
        seatList[seatClass][seatPosition] = name;
    }

}
