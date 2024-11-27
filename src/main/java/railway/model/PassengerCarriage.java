package railway.model;

/**
 * Пасажирський вагон.
 */
public class PassengerCarriage extends RailwayTransport {
    private int comfortLevel; // Рівень комфортності (1-5)

    public PassengerCarriage(int id, double weight, int capacity, int comfortLevel) {
        super(id, weight, capacity);
        this.comfortLevel = comfortLevel;
    }

    public int getComfortLevel() {
        return comfortLevel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Comfort Level: " + comfortLevel;
    }
}
