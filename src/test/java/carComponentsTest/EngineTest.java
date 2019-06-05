package carComponentsTest;

import carComponents.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    private Engine engine;

    @Before
    public void setUp(){
        engine = new Engine("Superduper", 5000);
    }

    @Test
    public void hasName(){
        assertEquals("Superduper", engine.getName());
    }

    @Test
    public void hasUnitCost(){
        assertEquals(5000, engine.getUnitCost(), 0.01);
    }

    @Test
    public void canSetName(){
        engine.setName("SuperSuperDuper");
        assertEquals("SuperSuperDuper", engine.getName());
    }

    @Test
    public void canSetPrice(){
        engine.setUnitCost(4500);
        assertEquals(4500, engine.getUnitCost(), 0.01);
    }

}
