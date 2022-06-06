package zadania.wzorceStrukturalne;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static Map<String, Engine> engines = new HashMap<>();

    static {
        engines.put("Polo", new Engine("Polo", "VW", "Benzyna"));
        engines.put("Passat", new Engine("Passat", "VW", "Benzyna"));
        engines.put("CRV", new Engine("CRV", "VW", "Disel"));
    }


    public static Vehicle createNewPolo(Long identifier, String producent, String VIN, Integer version, String modelName) {
        Vehicle vehicle = new Vehicle();
        vehicle.setIdentifier(identifier);
        vehicle.setProducent(producent);
        vehicle.setVIN(VIN);
        vehicle.setVersion(version);
        vehicle.setModelName(modelName);
        vehicle.setEngine(engines.get("Polo"));
        return vehicle;
    }
}