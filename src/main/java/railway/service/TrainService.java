package railway.service;

import railway.model.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Сервіс для роботи з потягом.
 */
public class TrainService {
    private List<RailwayTransport> train;

    public TrainService() {
        train = new ArrayList<>();
    }

    public void addCarriage(RailwayTransport carriage) {
        train.add(carriage);
    }

    public double calculateTotalWeight() {
        return train.stream().mapToDouble(RailwayTransport::getWeight).sum();
    }

    public int calculateTotalPassengers() {
        return train.stream()
                    .filter(c -> c instanceof PassengerCarriage)
                    .mapToInt(RailwayTransport::getCapacity)
                    .sum();
    }

    public void sortPassengerCarriagesByComfort() {
        train = train.stream()
                     .filter(c -> c instanceof PassengerCarriage)
                     .sorted(Comparator.comparingInt(c -> ((PassengerCarriage) c).getComfortLevel()))
                     .collect(Collectors.toList());
    }

    public List<CargoCarriage> findCargoCarriagesByType(String type) {
        return train.stream()
                    .filter(c -> c instanceof CargoCarriage)
                    .map(c -> (CargoCarriage) c)
                    .filter(c -> c.getCargoType().equalsIgnoreCase(type))
                    .collect(Collectors.toList());
    }

    public List<RailwayTransport> getTrain() {
        return train;
    }
}
