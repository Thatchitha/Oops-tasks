package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private final List<Room> rooms = new ArrayList<>();
    private final List<Booking> bookings = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }
    public List<Room> getRooms() {
        return rooms;
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }
    public List<Booking> getAllBookings() {
        return bookings;
    }
}
