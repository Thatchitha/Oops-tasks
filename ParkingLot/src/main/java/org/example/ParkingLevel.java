package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ParkingLevel {
    private  int levelNumber;
    private List<ParkingSpot> spots = new ArrayList<>();
    private List<ParkingObserver> parkingObservers=new ArrayList<>();
    public void addObserver(ParkingObserver observer) {
        parkingObservers.add(observer);
    }

    public ParkingLevel(int levelNumber, int numSmall, int numMedium, int numLarge) {
        this.levelNumber = levelNumber;
        int spotCounter = 1;

        for (int i = 0; i < numSmall; i++)
        {
            spots.add(new ParkingSpot(spotCounter++, SlotSize.SMALL));

        }
        spotCounter=1;

        for (int i = 0; i < numMedium; i++)
        {
            spots.add(new ParkingSpot(spotCounter++, SlotSize.MEDIUM));
        }
        spotCounter=1;

        for (int i = 0; i < numLarge; i++)
            spots.add(new ParkingSpot(spotCounter++, SlotSize.LARGE));
    }
    private void checkAndNotifyFull(SlotSize slotSize) {
        boolean full = spots.stream()
                .filter(s -> s.getSize() == slotSize)
                .allMatch(s -> s.getParkedVehicle() != null);

        if (full) {
            for (ParkingObserver o : parkingObservers) {
                o.notifyAll(levelNumber, slotSize);
            }
        }
    }

    public Optional<ParkingSpot> parkVehicle(Vehicle vehicle) {

        for (ParkingSpot spot : spots) {

                if(spot.getParkedVehicle()==null && spot.getSize()==vehicle.getSlotSize()) {
                spot.parkVehicle(vehicle);
                checkAndNotifyFull(vehicle.getSlotSize());
                return Optional.of(spot);
            }

        }
        return Optional.empty();
    }

    public Double unparkVehicle(String numberPlate) {
        for (ParkingSpot spot : spots) {
            Vehicle v = spot.getParkedVehicle();
            if (v != null && v.getNumberPlate().equals(numberPlate)) {
                spot.unparkVehicle();

                return spot.getParkingFee(v.getSlotSize());
            }
        }
       return null;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

}
