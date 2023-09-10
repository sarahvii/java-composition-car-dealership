import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DieselCarTest {

    private DieselCar dieselCar;

    @Before
    public void before() {
        dieselCar = new DieselCar("Diesel Car", "blue");
    }

    @Test
    public void hasColour() {
        assertEquals("blue", dieselCar.getColour());
    }
}
