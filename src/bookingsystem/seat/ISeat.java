package bookingsystem.seat;

import bookingsystem.show.Show;

public interface ISeat {
    int getRowNumber();
    int getSeatNumber();
    boolean isAvailable(Show show);
    void bookSeat(Show show);
    void displayDetails();
}
