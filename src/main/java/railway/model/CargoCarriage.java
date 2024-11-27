package railway.model;


/**
 * Вантажний вагон.
 */
public class CargoCarriage extends RailwayTransport {
    private double cargoWeightLimit; // Максимальна вантажопідйомність (тонни)
    private String cargoType;       // Тип вантажу (зерно, нафта тощо)

    public CargoCarriage(int id, double weight, int capacity, double cargoWeightLimit, String cargoType) {
        super(id, weight, capacity);
        this.cargoWeightLimit = cargoWeightLimit;
        this.cargoType = cargoType;
    }

    public double getCargoWeightLimit() {
        return cargoWeightLimit;
    }

    public String getCargoType() {
        return cargoType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cargo Weight Limit: " + cargoWeightLimit + "t, Cargo Type: " + cargoType;
    }
}
