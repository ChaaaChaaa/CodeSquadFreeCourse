package mission2.coffeeShop;

public class Latte extends Beverage {

    public Latte(KongCoffeeShop kongCoffeeShop) {
        this.coffeeShop = kongCoffeeShop;
        coffeeName = "라떼";
    }

    @Override
    public String getCoffeeName() {
        return coffeeName;
    }

    @Override
    public int getCost() {
        return 5000;
    }
}


