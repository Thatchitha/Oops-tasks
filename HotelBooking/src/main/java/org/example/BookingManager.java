package org.example;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

public class BookingManager {
    private  Hotel hotel;
    private AtomicInteger idCounter = new AtomicInteger(1);
    public BookingManager(Hotel hotel) {
        this.hotel = hotel;
    }
    public synchronized Booking bookRoom(RoomType type, String customer, LocalDate in, LocalDate out)
            throws BookingException {

        Room room = hotel.getRooms().stream()
                .filter(r -> r.getRoomType() == type && r.isAvailable(in, out))
                .findFirst()
                .orElseThrow(() -> new BookingException(type+" rooms are full for requested dates"));

        Booking booking = new Booking(idCounter.getAndIncrement(),
                room,  in, out,customer);

        room.addBooking(booking);
        hotel.addBooking(booking);

        return booking;
    }
    public synchronized double cancelBooking(int bookingId, LocalDate cancelDate) throws CancellationNotAllowedException {
        Booking booking = hotel.getAllBookings().stream()
                .filter(b -> b.getBookingId() == bookingId && !b.isCancelled())
                .findFirst()
                .orElseThrow(() -> new CancellationNotAllowedException("Booking not found or already cancelled."));

        if (!cancelDate.isBefore(booking.getCheckIn().minusDays(2))) {
            throw new CancellationNotAllowedException ("Cancellation denied  Must cancel at least 2 days before check-in.");
        }

        booking.cancel();
        long days = ChronoUnit.DAYS.between(booking.getCheckIn(),booking.getCheckOut());
        System.out.println(days);
        return booking.getRoom().getPrice() * days * 0.30;
    }



}
