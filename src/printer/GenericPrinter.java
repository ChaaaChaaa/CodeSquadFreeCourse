package printer;

public class GenericPrinter<T extends Element> {

    private T material;

    public T getMaterial() {
        return this.material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "재료는 " + this.material.elementName() + "입니다.";
    }
}
