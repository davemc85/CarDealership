package dealership;

import interfaces.IPurchase;
import vehicleType.VehicleType;

public class Till implements IPurchase {

    private double currentMoney;

    public Till(double currentMoney){
        this.currentMoney = currentMoney;
    }

    public double getCurrentMoney(){
        return this.currentMoney;
    }

    public void setCurrentMoney(double currentMoney){
        this.currentMoney = currentMoney;
    }

    public double paidForCar(VehicleType car){
        return currentMoney += car.getPrice();
    }

}
