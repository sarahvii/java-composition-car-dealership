import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dealership {

    private String branchName;
    public double till;

    public ArrayList<Vehicle> stockList;

    public Dealership(String branchName, double till, ArrayList<Vehicle> stockList) {
        this.branchName = branchName;
        this.till = till;
        this.stockList = stockList;
    }

    public double getTillBalance() {
        return this.till;
    }

    public int getStockListCount() {
        return this.stockList.size();
    }

    public void buyVehicle(Vehicle vehicle) {
        this.stockList.add(vehicle);
        this.till -= vehicle.getPrice();
    }

    public void sellVehicle(Vehicle vehicle, Customer customer) {
        this.stockList.remove(vehicle);
        this.till += vehicle.getPrice();
    }
}
