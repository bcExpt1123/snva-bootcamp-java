package bookingsystem.show;

public class Movie extends Show {

    public Movie(String showName, String showTiming, double ticketPrice) {
        super(showName, showTiming, ticketPrice);
    }

    public void displayDetails() {
        System.out.println("Movie Name: " + getShowName());
        System.out.println("Timing: " + getShowTiming());
        System.out.println("Ticket Price: " + getTicketPrice());
    }
}

