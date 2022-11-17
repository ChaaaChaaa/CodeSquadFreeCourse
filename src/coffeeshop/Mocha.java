package coffeeshop;

public class Mocha extends CondimentDecorator{
    Mocha(Coffee coffee) {
        super(coffee);
//        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" Adding Mocha Syrup";
    }

    @Override
    public void brewing() {
        System.out.print(getDescription());
    }
}
