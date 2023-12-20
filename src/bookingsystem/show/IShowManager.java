package bookingsystem.show;

import java.util.List;

public interface IShowManager {
    void addShow(Show show);
    List<Show> getShows();
    void displayShows();
}
