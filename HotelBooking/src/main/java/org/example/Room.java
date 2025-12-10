package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Room {
    private int roomNumber;
    private RoomType roomType;
    private double price;
    private List<Booking> bookings = new ArrayList<>();

    public Room(int roomNumber, RoomType roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
    public boolean isAvailable(LocalDate in,LocalDate out)
    {
        return bookings.stream().noneMatch(k->k.conflicts(in,out));
    }
    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomType=" + roomType +
                ", price=" + price +

                '}';
    }
}
