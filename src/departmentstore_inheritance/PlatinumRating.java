package departmentstore_inheritance;

public class PlatinumRating extends Customer{
    public PlatinumRating(String name, int buyPrice, int shoppingTime) {
        super(name, buyPrice, shoppingTime);
        super.rating = "PLATINUM";
        super.discountRate = 0.05;
        super.earnPoints = 0.05;
        super.parkingFee = 1000;
        super.isPrivateCounselor = false;
    }
}
