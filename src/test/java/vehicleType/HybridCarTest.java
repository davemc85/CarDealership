package vehicleType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    private HybridCar hybridCar;

    @Before
    public void setUp(){
        hybridCar = new HybridCar("Nissan", "Smooth", "red", 50000, "Smart engine");
    }

    @Test
    public void testGetManufacturer() {
        assertEquals("Nissan", hybridCar.getManufacturer());
    }
    @Test
    public void testGetBrand() {
        assertEquals("Smooth", hybridCar.getBrand());
    }
    @Test
    public void testGetColour() {
        assertEquals("red", hybridCar.getColour());
    }
    @Test
    public void testGetPriced() {
        assertEquals(50000, hybridCar.getPrice(), 0.01);
    }
    @Test
    public void testGetEngine() {
        assertEquals("Smart engine", hybridCar.getEngine());
    }
}
