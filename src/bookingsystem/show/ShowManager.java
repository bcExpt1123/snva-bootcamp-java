package bookingsystem.show;

import java.util.ArrayList;
import java.util.List;

public class ShowManager implements IShowManager{
    private List<Show> shows;

    public ShowManager() {
        shows = new ArrayList<>();
        addShow(new Movie("Movie1", "9:00 a.m", 15.0));
        addShow(new Movie("Movie2", "10:00 a.m", 10.0));
//        addShow(new Movie("Movie3", "13:00 a.m", 15.0));
//        addShow(new Movie("Movie4", "15:00 a.m", 5.0));
    }

    public void addShow(Show show) {
        shows.add(show);
    }

    public List<Show> getShows() {
        return shows;
    }

    public void displayShows() {
        System.out.println("Available Shows:");
        for (Show show : shows) {
            show.displayDetails();
        }
    }
}
