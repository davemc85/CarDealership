package dealership;

import org.junit.Before;
import org.junit.Test;
import vehicleType.PetrolCar;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private PetrolCar petrolCar;

    @Before
    public void setUp(){
        customer = new Customer("Kevin", "Toyota Avensis", 50000);
        petrolCar = new PetrolCar("Ford", "Focus", "blue", 26750, "Adequate engine");

    }

    @Test
    public void hasName(){
        assertEquals("Kevin", customer.getName());
    }

    @Test
    public void hasCurrentCar(){
        assertEquals("Toyota Avensis", customer.getCurrentCar());
    }

    @Test
    public void hasWallet(){
        assertEquals(50000, customer.getWallet(), 0.01);
    }

    @Test
    public void canChangeName(){
        customer.setName("David");
        assertEquals("David", customer.getName());
    }

    @Test
    public void canChangeCurrentCar(){
        customer.setCurrentCar("Mini Cooper");
        assertEquals("Mini Cooper", customer.getCurrentCar());
    }

    @Test
    public void canPayForCar(){
        customer.paidForCar(petrolCar);
        assertEquals(23250, customer.getWallet(), 0.01);
    }

}
