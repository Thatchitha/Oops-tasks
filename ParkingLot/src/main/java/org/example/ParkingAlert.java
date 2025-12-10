package org.example;

public class ParkingAlert implements ParkingObserver{

    @Override
    public void notifyAll(int levelNumer, SlotSize slotSize) {
        System.out.println(slotSize+" in "+levelNumer+" is full");
    }
}
