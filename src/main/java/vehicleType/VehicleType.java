package vehicleType;

public abstract class VehicleType {
    protected String manufacturer;
    protected String brand;
    protected String colour;
    protected double price;
    protected String engine;

    public VehicleType (String manufacturer, String brand, String colour, double price, String engine) {
        this.manufacturer = manufacturer;
        this.brand = brand;
        this.colour = colour;
        this.price = price;
        this.engine = engine;
    }


    public double getPrice() {
        return price;
    }
}
