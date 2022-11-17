package coffeeshop;

public class HawaiiAmericano extends Coffee{
    HawaiiAmericano(){
        this.description = "HawaiiAmericano";
    }

    @Override
    public String getDescription() {
        return this.description= "HawaiiAmericano";
    }

    @Override
    public void brewing() {
        System.out.print(description);
    }
}
