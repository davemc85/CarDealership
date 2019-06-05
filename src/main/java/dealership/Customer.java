package dealership;

import interfaces.IPurchase;
import vehicleType.VehicleType;

public class Customer implements IPurchase {

    private String name;
    private String currentCar;
    private double wallet;

    public Customer (String name, String currentCar, double wallet) {
        this.name = name;
        this.currentCar = currentCar;
        this.wallet = wallet;
    }

    public String getName () {
        return this.name;
    }

    public String getCurrentCar () {
        return this.currentCar;
    }

    public double getWallet(){
        return this.wallet;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setCurrentCar (String currentCar) {
        this.currentCar = currentCar;
    }

    public double paidForCar(VehicleType car){
        return wallet -= car.getPrice();
    }


}
