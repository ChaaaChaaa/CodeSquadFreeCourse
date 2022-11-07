package mission2.coffeeShop;

public abstract class Beverage {
    CoffeeShop coffeeShop;
    String coffeeName;

    public abstract String getCoffeeName();
    public abstract int getCost();
}
