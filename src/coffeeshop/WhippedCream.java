package coffeeshop;

public class WhippedCream extends CondimentDecorator {
    WhippedCream(Coffee coffee) {
        super(coffee);
        //this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" Adding WhippedCream";
    }

    @Override
    public void brewing() {
        System.out.print(getDescription());
    }
}
