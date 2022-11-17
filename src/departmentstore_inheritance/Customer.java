package departmentstore_inheritance;

public abstract class Customer {
    private final String name;
    private final  int buyPrice;
    private final int shoppingTime;

    String rating;
    double earnPoints;
    int parkingFee;
    double discountRate;
    boolean isPrivateCounselor;

    public Customer(String name, int buyPrice, int shoppingTime) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.shoppingTime = shoppingTime;
    }

    public int getPoint(){
        return (int)(earnPoints*buyPrice);
    }

    public int getParkingFee(){
        return parkingFee*shoppingTime;
    }

    public int getPayMoney(){
        return (int)(buyPrice - (discountRate*buyPrice));
    }

    public String getPrivateCounselor(){
        if(isPrivateCounselor){
            return "전문 상담원 배정이 가능합니다";
        }
        return "";
    }

    public String printCustomerInfo(){
        return name + "님의 지불 금액은 " + getPayMoney() + "원이고,적립 포인트는" + getPoint() + "점 입니다. 주차 요금은 "
                + getParkingFee() + "원 입니다. "+ getPrivateCounselor();
    }
}
