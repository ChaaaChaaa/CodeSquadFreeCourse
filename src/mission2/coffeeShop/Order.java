package mission2.coffeeShop;

public class Order {
    public static void main(String[] args) {
        Beverage americano = new Americano(new StarCoffeeShop());
        Person person1 = new Person("James", 5000, americano);
        int money = person1.getMoney() - americano.getCost();
        System.out.println(person1.getName() + "의 남은 돈은 " + money + "원 입니다. " + americano.coffeeShop.getCoffeeShopName() + "에서 "
                +  person1.getBeverage() + "를 마셨습니다.");

        Beverage latte = new Latte(new KongCoffeeShop());
        Person person2 = new Person("Tomas", 10000, latte);
        money = person2.getMoney() - latte.getCost();
        System.out.println(person2.getName() + "의 남은 돈은 " + money + "원 입니다. " + latte.coffeeShop.getCoffeeShopName() + "에서 "
                + person2.getBeverage() + "를 마셨습니다.");
    }
}
