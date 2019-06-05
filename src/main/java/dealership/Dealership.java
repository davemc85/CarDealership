package dealership;

import vehicleType.VehicleType;

import java.util.ArrayList;

public class Dealership{

    protected ArrayList<VehicleType> carsInStock;

    public Dealership(){
        carsInStock = new ArrayList<VehicleType>();
    }

    public void addCarToStock(VehicleType car){
        carsInStock.add(car);
    }
}
