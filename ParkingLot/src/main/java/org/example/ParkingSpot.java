package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class ParkingSpot {
    private int spotNumber;
    private SlotSize size;
    private Vehicle parkedVehicle;
    private LocalDateTime parkAt;
    private LocalDateTime unparkAt;

    public ParkingSpot() {
    }

    public ParkingSpot(int spotNumber, SlotSize size) {
        this.spotNumber = spotNumber;
        this.size = size;
    }


    public boolean parkVehicle(Vehicle vehicle) {

        this.parkedVehicle = vehicle;
        this.parkAt=LocalDateTime.of(2025, 12, 5, 18, 30, 0);
        return true;
    }
    public boolean unparkVehicle() {
        if (parkedVehicle == null) return false;
        parkedVehicle = null;
        this.unparkAt=LocalDateTime.of(2025, 12, 5, 20, 45, 0);
        return true;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public SlotSize getSize() {
        return size;
    }

    public LocalDateTime getParkAt() {
        return parkAt;
    }

    public LocalDateTime getUnparkAt() {
        return unparkAt;
    }
    public long getTotalHours() {
        if (parkAt == null || unparkAt == null) return 0;
        return Duration.between(parkAt, unparkAt).toHours();
    }

    public double getParkingFee(SlotSize size) {
        long hours = getTotalHours();
        if (hours == 0) return 0;

        double rate = switch (size) {
            case SMALL -> 10;
            case MEDIUM -> 30;
            case LARGE -> 50;
        };
        return rate * hours;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", size=" + size +
                ", parkedVehicle=" + parkedVehicle +
                ", parkAt=" + parkAt +
                ", unparkAt=" + unparkAt +
                '}';
    }
}
