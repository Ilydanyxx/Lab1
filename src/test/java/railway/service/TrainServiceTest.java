package railway.service;

import railway.service.TrainService;

import railway.model.PassengerCarriage;
import railway.model.CargoCarriage;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrainServiceTest {

    @Test
    void testCalculateTotalWeight() {
        TrainService service = new TrainService();
        service.addCarriage(new PassengerCarriage(1, 10.5, 50, 3));
        service.addCarriage(new CargoCarriage(2, 20.0, 0, 25.0, "grain"));
        assertEquals(30.5, service.calculateTotalWeight(), 0.01);
    }

    @Test
    void testCalculateTotalPassengers() {
        TrainService service = new TrainService();
        service.addCarriage(new PassengerCarriage(1, 10.5, 50, 3));
        service.addCarriage(new PassengerCarriage(2, 12.0, 70, 4));
        assertEquals(120, service.calculateTotalPassengers());
    }

    @Test
    void testFindCargoCarriagesByType() {
        TrainService service = new TrainService();
        service.addCarriage(new CargoCarriage(1, 20.0, 0, 25.0, "grain"));
        service.addCarriage(new CargoCarriage(2, 30.0, 0, 50.0, "coal"));
        List<CargoCarriage> grainCarriages = service.findCargoCarriagesByType("grain");
        assertEquals(1, grainCarriages.size());
        assertEquals("grain", grainCarriages.get(0).getCargoType());
    }
}
