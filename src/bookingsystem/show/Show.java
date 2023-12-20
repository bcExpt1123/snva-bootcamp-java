package bookingsystem.show;

public abstract class Show implements IShow {
    private String showName;
    private String showTiming;
    private double price;

    public Show(String showName, String showTiming, double ticketPrice) {
        this.showName = showName;
        this.showTiming = showTiming;
        this.price = ticketPrice;
    }

    public String getShowName() {
        return showName;
    }

    public String getShowTiming() {
        return showTiming;
    }

    public double getTicketPrice() {
        return price;
    }

    public abstract void displayDetails();
}
