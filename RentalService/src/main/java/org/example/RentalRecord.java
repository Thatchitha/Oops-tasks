package org.example;

import java.time.LocalDateTime;

public class RentalRecord {
    private Vehicle vehicle;
    private Customer customer;

    private LocalDateTime startTime;

    public RentalRecord(Vehicle vehicle, Customer customer) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.startTime = LocalDateTime.now();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
}
