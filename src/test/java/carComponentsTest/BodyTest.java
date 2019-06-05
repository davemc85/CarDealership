package carComponentsTest;

import carComponents.Body;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BodyTest {

    private Body body;

    @Before
    public void setUp(){
        body = new Body("Slimline", 15000);
    }

    @Test
    public void hasName(){
        assertEquals("Slimline", body.getName());
    }

    @Test
    public void hasUnitCost(){
        assertEquals(15000, body.getUnitCost(), 0.01);
    }

    @Test
    public void canSetName(){
        body.setName("SuperSuperDuper");
        assertEquals("SuperSuperDuper", body.getName());
    }

    @Test
    public void canSetPrice(){
        body.setUnitCost(4500);
        assertEquals(4500, body.getUnitCost(), 0.01);
    }
}
