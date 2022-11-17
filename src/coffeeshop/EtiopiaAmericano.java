package coffeeshop;

public class EtiopiaAmericano extends Coffee{
    EtiopiaAmericano(){
        description = "EtiopiaAmericano";
    }

    @Override
    public String getDescription() {
        return this.description= "EtiopiaAmericano";
    }

    @Override
    public void brewing() {
        System.out.print(description);
    }
}
