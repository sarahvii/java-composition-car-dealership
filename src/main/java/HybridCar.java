public class HybridCar extends Vehicle {

    Engine engine;

    public HybridCar(String colour, double price, Engine engine) {
        super(colour, price);
        this.engine = engine;

    }

    public double getEngineSize() {
        return engine.getEngineSize();
    }
}
