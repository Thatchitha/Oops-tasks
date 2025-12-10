package org.example;

import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private  Room room;
    private  LocalDate checkIn;
    private  LocalDate checkOut;
    private  String guestName;
    private boolean cancelled = false;


    public Booking(int bookingId, Room room, LocalDate checkIn, LocalDate checkOut, String guestName) {
        this.bookingId = bookingId;
        this.room=room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.guestName = guestName;

    }
    public boolean conflicts(LocalDate in, LocalDate out) {
        return !(out.isBefore(checkIn) || in.isAfter(checkOut));
    }
    public boolean isCancelled() { return cancelled; }
    public void cancel() { this.cancelled = true; }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", room=" + room +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", guestName='" + guestName + '\'' +
                ", cancelled=" + cancelled +
                '}';
    }

    public int getBookingId() {
        return bookingId;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public String getGuestName() {
        return guestName;
    }
}
