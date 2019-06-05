package dealership;

import org.junit.Before;
import org.junit.Test;
import vehicleType.PetrolCar;

import static org.junit.Assert.assertEquals;

public class TillTest {

    private Till till;
    private PetrolCar petrolCar;

    @Before
    public void setUp(){
        till = new Till(100000);
        petrolCar = new PetrolCar("Ford", "Focus", "blue", 26750, "Adequate engine");
    }

    @Test
    public void canGetCurrentMoney(){
        assertEquals(100000, till.getCurrentMoney(), 0.01);
    }

    @Test
    public void canSetCurrentMoney(){
        till.setCurrentMoney(200000);
        assertEquals(200000, till.getCurrentMoney(), 0.01);
    }

    @Test
    public void canGetPaidForCar(){
        till.paidForCar(petrolCar);
        assertEquals(126750, till.getCurrentMoney(), 0.01);
    }
}
