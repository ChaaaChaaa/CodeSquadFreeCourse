package coffeeshop;

public abstract class CondimentDecorator extends Coffee{
    Coffee coffee;

    public CondimentDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public abstract String getDescription();
}
