package concert;

public enum Seat {
    S(1),
    A(2),
    B(3);

    int inputSeatPosition;
    Seat(int inputSeatPosition){
        this.inputSeatPosition = inputSeatPosition;
    }
}
