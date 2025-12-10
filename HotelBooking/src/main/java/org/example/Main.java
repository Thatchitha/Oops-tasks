package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args)  {

        Hotel h = new Hotel();

        h.addRoom(new Room(101, RoomType.DELUXE, 3500));
        h.addRoom(new Room(102, RoomType.DELUXE, 3500));
        h.addRoom(new Room(201, RoomType.STANDARD, 2000));


        BookingManager manager = new BookingManager(h);
        try {
            System.out.println(manager.bookRoom(RoomType.DELUXE, "Amit",
                    LocalDate.of(2025, 12, 10),LocalDate.of(2025, 12, 15)));

            System.out.println(manager.bookRoom(RoomType.DELUXE, "Kiran",
                    LocalDate.now(), LocalDate.now().plusDays(2)));


            System.out.println(manager.bookRoom(RoomType.DELUXE, "Rahul",
                    LocalDate.now(), LocalDate.now().plusDays(2)));

        } catch (BookingException e) {
            System.out.println("Failed: " + e.getMessage());
        }
        try {
            System.out.println(manager.cancelBooking(1,LocalDate.now()));
        } catch (CancellationNotAllowedException e) {
            System.out.println(e.getMessage());
        }


    }
}