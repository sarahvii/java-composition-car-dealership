import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Deque;
import java.util.zip.DeflaterInputStream;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private ArrayList<Vehicle> vehiclesOwned;

    private DieselCar dieselCar;
    private Engine engine;

    @Before
    public void before() {
        vehiclesOwned = new ArrayList<>();
        customer = new Customer(20000.00, vehiclesOwned);
        engine = new Engine(2.5);
        dieselCar = new DieselCar("green", 14999, engine);
    }

    @Test
    public void customerHasFunds() {
        assertEquals(20000, customer.getFunds(), 0.0);
    }

    @Test
    public void customerOwnsVehicles() {
        assertEquals(0, customer.getNumberOfVehiclesOwned());
    }

    @Test
    public void customerCanBuyVehicle() {
        customer.buyVehicle(dieselCar);
        assertEquals(1, customer.getNumberOfVehiclesOwned());
    }
}
