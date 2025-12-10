package org.example;

import java.time.LocalDateTime;

public class Car implements Vehicle{
    private  String registerId;
    private  String model;
    private  double rentPerHour;
    private boolean available = true;

    public Car(String registerId, String model, double rentPerHour) {
        this.registerId = registerId;
        this.model = model;
        this.rentPerHour = rentPerHour;
    }

    @Override
    public String getRegisterId() {
        return registerId;
    }

    @Override
    public double getRentPerHour() {
        return rentPerHour;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public void setAvailable(boolean status) {
        this.available=status;


    }
}
