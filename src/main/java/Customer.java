import java.util.ArrayList;

public class Customer {

    private double funds;
    private ArrayList<Vehicle> vehiclesOwned;

    public Customer(double funds, ArrayList<Vehicle> vehiclesOwned) {
        this.funds = funds;
        this.vehiclesOwned = vehiclesOwned;
    }

    public double getFunds() {
        return this.funds;
    }

    public int getNumberOfVehiclesOwned() {
        return this.vehiclesOwned.size();
    }

    public void buyVehicle(Vehicle vehicle) {
        this.vehiclesOwned.add(vehicle);
    }
}
