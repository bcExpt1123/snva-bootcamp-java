package bookingsystem.seat;

import bookingsystem.show.Show;

public interface ISeatManager {
    void addSeat(Seat seat);
    Seat getSeat(int rowNumber, int seatNumber);
    void displayAvailableSeats(Show show);
    void reserveSeat(Seat seat, Show show);
}
