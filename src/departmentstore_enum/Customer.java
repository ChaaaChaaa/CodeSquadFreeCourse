package departmentstore_enum;

public class Customer {
    String name;
    CustomerRatingInfo customerRatingInfo;
    int buyPrice;
    int shoppingTime;

    public Customer(String name, CustomerRatingInfo customerRatingInfo,int buyPrice,int shoppingTime) {
        this.name = name;
        this.customerRatingInfo = customerRatingInfo;
        this.buyPrice = buyPrice;
        this.shoppingTime = shoppingTime;
    }

    public int getPoint(){
        return (int)(customerRatingInfo.earnPoints*buyPrice);
    }

    public int getParkingFee(){
        return customerRatingInfo.parkingFee*shoppingTime;
    }

    public int getPayMoney(){
        return (int)(buyPrice - (customerRatingInfo.discountRate*buyPrice));
    }

    public String getPrivateCounselor(){
        if(customerRatingInfo.isPrivateCounselor()){
            return "전문 상담원 배정이 가능합니다";
        }
        return "";
    }
}
