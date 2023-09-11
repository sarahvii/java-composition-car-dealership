import java.util.ArrayList;

public class Customer {

    private double funds;
    private String name;
    private ArrayList<Vehicle> vehiclesOwned;

    public Customer(double funds, String name) {
        this.funds = funds;
        this.name = name;
        this.vehiclesOwned = new ArrayList<>();
    }

    public double getFunds() {
        return this.funds;
    }

    public int getNumberOfVehiclesOwned() {
        return this.vehiclesOwned.size();
    }

    public void buyVehicle(Vehicle vehicle) {
        this.vehiclesOwned.add(vehicle);
        this.funds -= vehicle.getPrice();
    }
}
