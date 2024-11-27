package main.java.railway;

import railway.model.*;
import railway.service.TrainService;

public class Main {
    public static void main(String[] args) {
        TrainService trainService = new TrainService();

        // Додаємо вагони
        trainService.addCarriage(new PassengerCarriage(1, 10.5, 50, 3));
        trainService.addCarriage(new PassengerCarriage(2, 12.0, 70, 4));
        trainService.addCarriage(new CargoCarriage(3, 20.0, 0, 25.0, "grain"));
        trainService.addCarriage(new Locomotive(4, 80.0, 0, 200.0, 120));

        // Загальна вага
        System.out.println("Total weight: " + trainService.calculateTotalWeight() + " tons");

        // Кількість пасажирів
        System.out.println("Total passengers: " + trainService.calculateTotalPassengers());

        // Сортування пасажирських вагонів за комфортом
        trainService.sortPassengerCarriagesByComfort();
        System.out.println("Sorted Passenger Carriages: " + trainService.getTrain());

        // Пошук вантажних вагонів за типом
        System.out.println("Cargo carriages (grain): " + trainService.findCargoCarriagesByType("grain"));
    }
}
