package printer;

public class Plastic implements Element {

    private final String name;

    public Plastic() {
        this.name = "Plastic";
    }

    @Override
    public String elementName() {
        return this.name;
    }
}