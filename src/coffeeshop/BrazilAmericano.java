package coffeeshop;

public class BrazilAmericano extends Coffee{
    BrazilAmericano(){
        description = "BrazilAmericano";
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void brewing() {
        System.out.print(description);
    }
}
