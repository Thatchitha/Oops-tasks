package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingLot {
    private List<ParkingLevel> levels=new ArrayList<>();
    public ParkingLot() {
    }

    public ParkingLot(int numLevels, int smallPerLevel, int mediumPerLevel, int largePerLevel) {
        for (int i = 1; i <= numLevels; i++) {
            levels.add(new ParkingLevel(i, smallPerLevel, mediumPerLevel, largePerLevel));
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingLevel level : levels) {
            Optional<ParkingSpot> spot = level.parkVehicle(vehicle);
            if (spot.isPresent()) {
                System.out.println("Parked " + vehicle.getVehicleType() + " " + vehicle.getNumberPlate() +
                        " at Level " + level.getLevelNumber() + " Spot " + spot.get().getSpotNumber());
                return true;
            }
        }
        System.out.println("No available spot for " + vehicle.getNumberPlate());
        return false;
    }

    public Double unparkVehicle(String numberPlate) {
        for (ParkingLevel level : levels) {
            double fee=level.unparkVehicle(numberPlate);
                System.out.println("Unparked vehicle " + numberPlate);

            return fee;
        }
        System.out.println("Vehicle not found: " + numberPlate);
        return null;

    }

    public List<ParkingLevel> getLevels() {
        return levels;
    }
}
