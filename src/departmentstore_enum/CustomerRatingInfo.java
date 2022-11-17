package departmentstore_enum;

public enum CustomerRatingInfo {
    NOTHING(0, 0, false, 0),
    RED(0, 0.01f, false, 3000),
    PLATINUM(0.05f, 0.05f, false, 1000),
    DIAMOND(0.1f, 0.1f, true, 0);


    float discountRate;
    float earnPoints;
    boolean isPrivateCounselor;
    int parkingFee;

    CustomerRatingInfo(float discountRate, float earnPoints, boolean isPrivateCounselor, int parkingFee) {
        this.discountRate = discountRate;
        this.earnPoints = earnPoints;
        this.isPrivateCounselor = isPrivateCounselor;
        this.parkingFee = parkingFee;
    }

    public boolean isPrivateCounselor() {
        return isPrivateCounselor;
    }
}
