package departmentstore_inheritance;

public class RedRating extends Customer{
    public RedRating(String name, int buyPrice, int shoppingTime) {
        super(name, buyPrice, shoppingTime);
        super.rating = "RED";
        super.earnPoints = 0.01;
        super.parkingFee = 3000;
        super.isPrivateCounselor = false;
    }
}
