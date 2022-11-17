package coffeeshop;

public abstract class Coffee {
    String description = "커피이름";

    public String getDescription(){
        return description;
    }

    public abstract void brewing();
}
