package bookingsystem.bookingsystem;

import bookingsystem.seat.Seat;
import bookingsystem.show.Show;

/**
 * You are tasked with creating
 * a booking system for a theater
 * with different types of shows
 * and seating arrangements.
 * Explain how you would use
 * polymorphism and abstraction to
 * model the diverse shows and
 * handle ticket reservations.
 */

public class TheaterBookingSystem {
    public static void book() {
        // Create a booking system
        BookingSystem bookingSystem = new BookingSystem();

        // Display available shows and seats
        bookingSystem.showManager.displayShows();
        bookingSystem.displayAvailableSeats();

        Seat seat1 =bookingSystem.seatManager.getSeat(1, 0);
        Seat seat2 =bookingSystem.seatManager.getSeat(1, 2);
        Show show = bookingSystem.showManager.getShows().get(1);

        // Reserve a seat
        bookingSystem.seatManager.reserveSeat(seat1, show);
        bookingSystem.seatManager.reserveSeat(seat2, show);

        System.out.println(seat1.isAvailable(show));
        System.out.println(show.getShowName());

        bookingSystem.seatManager.reserveSeat(seat1, show);

        bookingSystem.displayAvailableSeats();
    }
}
