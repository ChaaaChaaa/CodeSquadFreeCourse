package departmentstore_inheritance;

public class DiamondRating extends Customer {
    public DiamondRating(String name, int buyPrice, int shoppingTime) {
        super(name, buyPrice, shoppingTime);
        super.rating = "DIAMOND";
        super.discountRate = 0.1;
        super.earnPoints = 0.1;
        super.parkingFee = 0;
        super.isPrivateCounselor = true;

    }
}
