package mission2.coffeeShop;

public class Person {
    String name;
    int money;
    Beverage beverage;

    public Person(String name, int money, Beverage beverage) {
        this.name = name;
        this.money = money;
        this.beverage = beverage;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public String getBeverage() {
        return beverage.getCoffeeName();
    }
}
