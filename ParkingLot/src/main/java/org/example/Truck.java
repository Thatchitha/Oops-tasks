package org.example;

public class Truck implements Vehicle{
    private  String numberPlate;

    public Truck(String numberPlate) {
        this.numberPlate = numberPlate;
    }


    @Override
    public String getNumberPlate() {
        return numberPlate;
    }

    @Override
    public String getVehicleType() {
        return "TRUCK";
    }

    @Override
    public SlotSize getSlotSize() {
        return SlotSize.LARGE;
    }
}
