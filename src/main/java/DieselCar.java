public class DieselCar extends Vehicle {

    Engine engine;

    public DieselCar(String colour, double price, Engine engine) {
        super(colour, price);
        this.engine = engine;

    }

    public double getEngineSize() {
        return engine.getEngineSize();
    }
}
