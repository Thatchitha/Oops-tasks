package org.example;

public class Bike implements Vehicle{
    private  String numberPlate;

    public Bike(String numberPlate) {
        this.numberPlate = numberPlate;
    }


    @Override
    public String getNumberPlate() {
        return numberPlate;
    }

    @Override
    public String getVehicleType() {
        return "BIKE";
    }

    @Override
    public SlotSize getSlotSize() {
        return SlotSize.SMALL;
    }
}
