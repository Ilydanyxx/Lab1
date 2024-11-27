package railway.model;

/**
 * Локомотив.
 */
public class Locomotive extends RailwayTransport {
    private double fuelConsumption; // Витрата палива (л/100 км)
    private int maxSpeed;           // Максимальна швидкість (км/год)

    public Locomotive(int id, double weight, int capacity, double fuelConsumption, int maxSpeed) {
        super(id, weight, capacity);
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fuel Consumption: " + fuelConsumption + "l/100km, Max Speed: " + maxSpeed + "km/h";
    }
}
