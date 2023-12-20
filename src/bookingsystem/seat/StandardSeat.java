package bookingsystem.seat;

public class StandardSeat extends Seat {
    public StandardSeat(int rowNumber, int seatNumber) {
        super(rowNumber, seatNumber);
    }

    @Override
    public void displayDetails() {
        System.out.println("Standard Seat: Row " + getRowNumber() + ", Seat " + getSeatNumber());
    }
}