import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    private ElectricCar electricCar;

    @Before
    public void before() {
        electricCar = new ElectricCar("pink", 12999);
    }

    @Test
    public void hasColour() {
        assertEquals("pink", electricCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(12999, electricCar.getPrice(), 0.01);
    }

}
