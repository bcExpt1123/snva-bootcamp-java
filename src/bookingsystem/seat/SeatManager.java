package bookingsystem.seat;

import bookingsystem.show.Show;
import java.util.ArrayList;
import java.util.List;

public class SeatManager implements ISeatManager{
    private List<Seat> seats;
    private int maxRow;
    private int maxSeat;
    public SeatManager() {
        seats = new ArrayList<>();

        maxRow = 2;
        maxSeat = 3;

        for (int r = 0; r <= maxRow; r++) {
            for (int s = 0; s <= maxSeat; s++) {
                addSeat(new StandardSeat(r, s));
            }
        }
    }
    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public void displayAvailableSeats(Show show) {
        System.out.print("Show " + show.getShowName() + " at " + show.getShowTiming());
        System.out.println(" > Available Seats:");
        for (Seat seat : seats) {
            if (seat.isAvailable(show)) {
                seat.displayDetails();
            }
        }
    }

    public Seat getSeat(int rowNumber, int seatNumber) {
        for (Seat seat : seats) {
            if(seat.getRowNumber() == rowNumber && seat.getSeatNumber() == seatNumber) {
                return seat;
            }
        }
        return null;
    }

    public void reserveSeat(Seat seat, Show show) {
        if(seat.isAvailable(show)) {
            seat.bookSeat(show);
            System.out.println("Seat [Row: " + seat.getRowNumber() + ", Seat: " + seat.getSeatNumber() + "] booked successfully!");
            return;
        }
        System.out.println("Seat [Row: " + seat.getRowNumber() + ", Seat: " + seat.getSeatNumber() + "] is not available.");
    }
}
