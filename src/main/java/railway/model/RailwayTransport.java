package railway.model;


/**
 * Базовий клас для рухомого складу.
 */
public class RailwayTransport {
    private int id;
    private double weight; // Вага у тоннах
    private int capacity;  // Місткість (пасажири або вантаж)

    public RailwayTransport(int id, double weight, int capacity) {
        this.id = id;
        this.weight = weight;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Weight: " + weight + "t, Capacity: " + capacity;
    }
}
