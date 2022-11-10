package carfactory;

public class HyundaiFactory {

    public static HyundaiFactory getFactory(){
        return new HyundaiFactory();
    }

    public Car createCar() {
        return new Car();
    }
}
