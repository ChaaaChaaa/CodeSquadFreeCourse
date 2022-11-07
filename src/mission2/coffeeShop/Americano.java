package mission2.coffeeShop;

public class Americano extends Beverage {

    public Americano(StarCoffeeShop starCoffeeShop) {
        this.coffeeShop = starCoffeeShop;
        coffeeName = "아메리카노";
    }

    @Override
    public String getCoffeeName() {
        return coffeeName;
    }

    @Override
    public int getCost() {
        return 4000;
    }
}
