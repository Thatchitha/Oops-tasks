package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Vehiclecategory {
    private  String model;
    private  List<Vehicle> vehicles = new ArrayList<>();

    public Vehiclecategory(String model) {
        this.model = model;
    }
    public void addVehicle(Vehicle vehicle)
    {
        vehicles.add(vehicle);
    }
    public Optional<Vehicle> getAvailableVehicle() {
        return vehicles.stream().filter(Vehicle::isAvailable).findFirst();
    }

    public int getAvailableCount() {
        return (int) vehicles.stream().filter(Vehicle::isAvailable).count();
    }

    public String getModel() { return model; }

    public List<Vehicle> getVehicles() { return vehicles; }
}
