import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DieselCarTest {

    private DieselCar dieselCar;
    private Engine engine;

    @Before
    public void before() {
        engine = new Engine(2.0);
        dieselCar = new DieselCar("blue", 9999, engine);
    }

    @Test
    public void hasColour() {
        assertEquals("blue", dieselCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(9999, dieselCar.getPrice(), 0.01);
    }

    @Test
    public void hasEngineSize() {
        assertEquals(2.0, dieselCar.getEngineSize(), 0.01);
    }
}
