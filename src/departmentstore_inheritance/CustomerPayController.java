package departmentstore_inheritance;

import java.util.Arrays;

public class CustomerPayController {
    public static void main(String[] args) {
        Customer james = new RedRating("James", 10000, 2);
        Customer tomas = new RedRating("Tomas", 30000, 2);
        Customer edward = new PlatinumRating("Edward", 10000, 2);
        Customer percy = new PlatinumRating("Percy", 30000, 2);
        Customer elizabet = new DiamondRating("Elizabet", 30000, 2);

        Arrays.asList(james, tomas, edward, percy, elizabet)
                .forEach(customer -> System.out.println(customer.printCustomerInfo()));
    }
}
