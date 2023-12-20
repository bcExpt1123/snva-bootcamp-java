package bookingsystem.show;

public interface IShow {
    String getShowName();

    String getShowTiming();

    double getTicketPrice();

    void displayDetails();
}