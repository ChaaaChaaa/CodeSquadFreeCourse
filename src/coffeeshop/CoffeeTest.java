package coffeeshop;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee etiopiaAmericano = new EtiopiaAmericano();
        etiopiaAmericano.brewing();
        System.out.println();

        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(kenyaAmericano);
        kenyaLatte.brewing();
        System.out.println();

        Coffee brazilMocha = new Mocha(new Latte(new BrazilAmericano()));
        brazilMocha.brewing();
        System.out.println();

//        Coffee hawaiiWhippedMocha =
//                new WhippedCream(new Mocha(new Latte( new HawaiiAmericano())));
        Coffee hawaiiWhippedMocha = new HawaiiAmericano();
        hawaiiWhippedMocha = new Latte(hawaiiWhippedMocha);
        hawaiiWhippedMocha = new Mocha(hawaiiWhippedMocha);
        hawaiiWhippedMocha = new WhippedCream(hawaiiWhippedMocha);

        hawaiiWhippedMocha.brewing();
        System.out.println();

    }
}
