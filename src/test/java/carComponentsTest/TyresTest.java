package carComponentsTest;

import carComponents.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    private Tyres tyres;

    @Before
    public void setUp(){
        tyres = new Tyres("Goodyear", 500);
    }

    @Test
    public void hasName(){
        assertEquals("Goodyear", tyres.getName());
    }

    @Test
    public void hasUnitCost(){
        assertEquals(500, tyres.getUnitCost(), 0.01);
    }

    @Test
    public void canSetName(){
        tyres.setName("Bridgestone");
        assertEquals("Bridgestone", tyres.getName());
    }

    @Test
    public void canSetPrice(){
        tyres.setUnitCost(450);
        assertEquals(450, tyres.getUnitCost(), 0.01);
    }
}
