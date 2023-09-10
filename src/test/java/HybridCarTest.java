import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    private HybridCar hybridCar;
    private Engine engine;

    @Before
    public void before() {
        engine = new Engine(1.5);
        hybridCar = new HybridCar("yellow", 11999, engine);
    }

    @Test
    public void hasColour() {
        assertEquals("yellow", hybridCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(11999, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void hasEngineSize() {
        assertEquals(1.5, hybridCar.getEngineSize(), 0.01);
    }
}
