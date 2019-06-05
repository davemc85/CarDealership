package dealership;

import org.junit.Before;
import org.junit.Test;
import vehicleType.ElectricCar;
import vehicleType.PetrolCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private PetrolCar petrolCar;
    private ElectricCar electricCar;

    @Before
    public void setUp(){
        dealership = new Dealership();
        petrolCar = new PetrolCar("Ford", "Focus", "blue", 26750, "Adequate engine");
        electricCar = new ElectricCar("Tesla", "Rapid", "gold", 12345, "Superduper engine");
    }

    @Test
    public void canAddCarToStock(){
        dealership.addCarToStock(petrolCar);
        assertEquals(1, dealership.carsInStock.size());
    }

    @Test
    public void canAddDifferentTypesOfCarToArray(){
        dealership.addCarToStock(petrolCar);
        dealership.addCarToStock(electricCar);
        assertEquals(2, dealership.carsInStock.size());
    }
}
