package departmentstore_enum;

import java.util.Arrays;

public class CustomerPayController {
    public static void main(String[] args) {
        Customer James = new Customer("James", CustomerRatingInfo.RED, 10000, 2);
        Customer Tomas = new Customer("Tomas", CustomerRatingInfo.RED, 30000, 2);
        Customer Edward = new Customer("Edward", CustomerRatingInfo.PLATINUM, 10000, 2);
        Customer Percy = new Customer("Percy", CustomerRatingInfo.PLATINUM, 30000, 2);
        Customer Elizabet = new Customer("Elizabet", CustomerRatingInfo.DIAMOND, 30000, 2);

        Arrays.asList(James, Tomas, Edward, Percy, Elizabet)
                .forEach(customer -> System.out.println(customer.name + "님의 지불 금액은 " + customer.getPayMoney() + "원이고, " +
                        "적립 포인트는" + customer.getPoint() + "점 입니다. 주차 요금은 " + customer.getParkingFee() + "원 입니다. "
                        + customer.getPrivateCounselor()));
    }
}
