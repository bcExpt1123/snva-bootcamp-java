package bookingsystem.seat;

import bookingsystem.show.Show;

import java.util.ArrayList;
import java.util.List;

public abstract class Seat implements ISeat {
    private int rowNumber;
    private int seatNumber;
    private List<Show> reservedShows;
    public Seat(int rowNumber, int seatNumber) {
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        reservedShows = new ArrayList<>();
    }
    public int getRowNumber() {
        return rowNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
    public boolean isAvailable(Show show) {
        if(reservedShows.isEmpty()) return true;
        return !reservedShows.contains(show);
    }
    public void bookSeat(Show show) {
        reservedShows.add(show);
    }
    public abstract void displayDetails(); // Abstract method to display seat details
}