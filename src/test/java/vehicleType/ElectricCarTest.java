package vehicleType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    private ElectricCar electricCar;

    @Before
    public void setUp(){
        electricCar = new ElectricCar("Tesla", "Rapid", "gold", 12345, "Superduper engine");
    }

    @Test
    public void testGetManufacturer() {
        assertEquals("Tesla", electricCar.getManufacturer());
    }
    @Test
    public void testGetBrand() {
        assertEquals("Rapid", electricCar.getBrand());
    }
    @Test
    public void testGetColour() {
        assertEquals("gold", electricCar.getColour());
    }
    @Test
    public void testGetPriced() {
        assertEquals(12345, electricCar.getPrice(), 0.01);
    }
    @Test
    public void testGetEngine() {
        assertEquals("Superduper engine", electricCar.getEngine());
    }
}
