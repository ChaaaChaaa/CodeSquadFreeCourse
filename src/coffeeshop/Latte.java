package coffeeshop;

public class Latte extends CondimentDecorator{
    public Latte(Coffee coffee) {
        super(coffee);
        //this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" Adding Milk";
    }

    @Override
    public void brewing() {
        System.out.print(getDescription());
    }
}
