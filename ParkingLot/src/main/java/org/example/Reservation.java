package org.example;

import java.time.LocalDateTime;

public class Reservation {
    private String numberPlate;
    private SlotSize size;
    private LocalDateTime reservetime;
    private boolean used=false;

    public Reservation(String numberPlate, SlotSize size, LocalDateTime reservetime) {
        this.numberPlate = numberPlate;
        this.size = size;
        this.reservetime = reservetime;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public SlotSize getSize() {
        return size;
    }

    public LocalDateTime getReservetime() {
        return reservetime;
    }

    public boolean isUsed() {
        return used;
    }
    public void markUsed() {
        this.used = true; }
}
