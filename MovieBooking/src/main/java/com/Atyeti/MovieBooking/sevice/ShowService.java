package com.Atyeti.MovieBooking.sevice;

import com.Atyeti.MovieBooking.exception.ScreenAlreadyOccupiedExcetion;
import com.Atyeti.MovieBooking.model.Movie;
import com.Atyeti.MovieBooking.model.Screen;
import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.model.Show;
import com.Atyeti.MovieBooking.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.swing.tree.RowMapper;
import java.io.File;
import java.io.Serial;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
@Service
public class ShowService {

    @Autowired
    ScreenService screenService;
    @Autowired
    MovieServie movieServie;
@Autowired
    ShowRepo showRepo;



    public Show createShow(String movieId, String screenId, Date startTime, Integer durationInseconds) {
        Screen screen = screenService.getScreen(screenId);
        Movie movie = movieServie.getMovie(movieId);
        if (screen != null && movie != null) {
            if (!checkShowCreationAllowed(screen, startTime, durationInseconds)) {
                throw new ScreenAlreadyOccupiedExcetion();
            }
            String showId = UUID.randomUUID().toString();
            Show show = new Show(showId, movie, screen, startTime, durationInseconds);
            showRepo.createShow(showId, show);
            return show;
        } else {
            throw new NullPointerException();
        }

    }

    private boolean checkShowCreationAllowed(Screen screen, Date startDate, Integer durationInSeconds) {
        return true;
    }

    public List<Show> getShowsForScreen(Screen screen) {
        List<Show> response = new ArrayList<>();
        for (Show show : showRepo.getAllShow().values()) {
            if (show.getScreen().equals(screen)) {
                response.add(show);
            }
        }
        return response;
    }


    public Show getShow(String showId) {
        Show show = showRepo.getShow(showId);
        if (show == null) {
            throw new NullPointerException();
        }
        return show;
    }


  /*  public List<Seat> getAvailableSeats(String showId)
    {
        return seatAvailabilityService.getAvialableSeats(showId);
    }*/

}
