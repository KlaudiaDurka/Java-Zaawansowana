package zadania.wzorceStrukturalne;

import java.util.ArrayList;
import java.util.List;

public class FlyweightMain {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        for (Long i = 0L; i < 1000L; i++) {
            Vehicle newVehicle = VehicleFactory.createNewPolo(i, "VW", "123" + i, 1, "Vectra");
            vehicles.add(newVehicle);
        }
    }
}
