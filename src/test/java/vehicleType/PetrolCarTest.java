package vehicleType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    private PetrolCar petrolCar;

    @Before
    public void setUp(){
        petrolCar = new PetrolCar("Ford", "Focus", "blue", 26750, "Adequate engine");
    }

    @Test
    public void testGetManufacturer() {
        assertEquals("Ford", petrolCar.getManufacturer());
    }
    @Test
    public void testGetBrand() {
        assertEquals("Focus", petrolCar.getBrand());
    }
    @Test
    public void testGetColour() {
        assertEquals("blue", petrolCar.getColour());
    }
    @Test
    public void testGetPriced() {
        assertEquals(26750, petrolCar.getPrice(), 0.01);
    }
    @Test
    public void testGetEngine() {
        assertEquals("Adequate engine", petrolCar.getEngine());
    }
}
