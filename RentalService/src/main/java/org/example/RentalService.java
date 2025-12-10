package org.example;

import java.time.LocalDateTime;
import java.util.*;

public class RentalService {
   Map<String,Vehiclecategory> categories=new HashMap<>();
   Map<String,RentalRecord> activeVehicles=new HashMap<>();
   private Billing billing=new Billing();
    public void addVehicle(Vehicle vehicle)
    {
        categories.computeIfAbsent(vehicle.getModel(),Vehiclecategory::new).addVehicle(vehicle);
    }
    public void rentVehicle(String type,String model,Customer customer)
    {
       Vehiclecategory category=categories.get(model);
        if (category == null) throw new RuntimeException("Model not found: " + model);

        Optional<Vehicle> vehicle = category.getVehicles().stream()
                .filter(v -> v.getType().equalsIgnoreCase(type) && v.isAvailable())
                .findFirst();

        if (vehicle .isEmpty()) throw new RuntimeException(model+" is not available");
        Vehicle vehicle1 = vehicle.get();
        vehicle1.setAvailable(false);
        RentalRecord record = new RentalRecord(vehicle1, customer);
        activeVehicles.put(vehicle1.getRegisterId(),        record);

    }

    public double returnVehicle(String regId)
    {
        RentalRecord record = activeVehicles.remove(regId);
        if(record == null) throw new RuntimeException("Vehicle not rented");

        double bill =billing .calculate(record);

        record.getVehicle().setAvailable(true);

        System.out.println("Returned: " + regId);
        System.out.println("Bill: ₹" + bill);
        return bill;

    }
    public int getAvailableCount(String model) {
        Vehiclecategory category = categories.get(model);
        return category == null ? 0 : category.getAvailableCount();
    }

}
