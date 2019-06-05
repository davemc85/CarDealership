package vehicleType;

public class HybridCar extends VehicleType {
    public HybridCar(String manufacturer, String brand, String colour, double price, String engine) {
        super(manufacturer, brand, colour, price, engine);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public String getEngine() {
        return engine;
    }
}
