package printer;

public class Powder implements Element {

    private final String name;

    public Powder() {
        this.name = "Powder";
    }

    @Override
    public String elementName() {
        return this.name;
    }
}