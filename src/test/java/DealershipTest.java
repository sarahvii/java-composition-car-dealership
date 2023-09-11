import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    private ArrayList<Vehicle> stockList;

    private HybridCar hybridCar;
    private ElectricCar electricCar;

    private Engine engine;

    private Customer customer;

    @Before
    public void before() {
        stockList = new ArrayList<>();
        engine = new Engine(1.8);
        hybridCar = new HybridCar("black", 9999, engine);
        electricCar = new ElectricCar("green", 12999);
        dealership = new Dealership("Edinburgh Engines", 100000, stockList);
        customer = new Customer(40000, "Johnny");
    }

    @Test
    public void dealershipHasTillWithMoney() {
        assertEquals(100000, dealership.getTillBalance(), 0.01);
    }

    @Test
    public void dealershipCanAddCar() {
        stockList.add(hybridCar);
        stockList.add(electricCar);
        assertEquals(2, dealership.getStockListCount());
    }

    @Test
    public void dealershipCanBuyCar() {
        dealership.buyVehicle(electricCar);
        assertEquals(1, dealership.getStockListCount());
        assertEquals(87001, dealership.getTillBalance(), 0.01);
    }

    @Test
    public void dealershipCanSellCar() {
        dealership.buyVehicle(electricCar);
        dealership.buyVehicle(electricCar);
        dealership.sellVehicle(electricCar, customer);
        assertEquals(1, dealership.getStockListCount());
        assertEquals(87001, dealership.getTillBalance(), 0.01);
    }





}
