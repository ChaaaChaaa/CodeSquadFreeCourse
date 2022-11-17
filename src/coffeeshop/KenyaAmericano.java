package coffeeshop;

public class KenyaAmericano extends Coffee{
    KenyaAmericano(){
        description = "KenyaAmericano";
    }

    @Override
    public String getDescription() {
        return this.description="KenyaAmericano";
    }

    @Override
    public void brewing() {
        System.out.print(description);
    }
}
