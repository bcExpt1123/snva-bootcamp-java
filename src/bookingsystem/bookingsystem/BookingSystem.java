package bookingsystem.bookingsystem;

import bookingsystem.seat.SeatManager;
import bookingsystem.show.Show;
import bookingsystem.show.ShowManager;

import java.util.List;

public class BookingSystem implements IBookingSystem {
    public ShowManager showManager;
    public SeatManager seatManager;
    public BookingSystem() {
        showManager = new ShowManager();
        seatManager = new SeatManager();
    }

    public void displayAvailableSeats() {
        for (Show show : showManager.getShows()) {
            seatManager.displayAvailableSeats(show);
        }
    }
}
