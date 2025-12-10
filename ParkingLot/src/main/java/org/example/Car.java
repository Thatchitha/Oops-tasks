package org.example;

public class Car implements Vehicle{
    private  String numberPlate;

    public Car(String numberPlate) {
        this.numberPlate = numberPlate;
    }


    @Override
    public String getNumberPlate() {
        return numberPlate;
    }

    @Override
    public String getVehicleType() {
        return "CAR";
    }

    @Override
    public SlotSize getSlotSize() {
        return SlotSize.MEDIUM;
    }
}
