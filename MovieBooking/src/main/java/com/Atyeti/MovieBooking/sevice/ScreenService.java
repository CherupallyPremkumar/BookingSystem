package com.Atyeti.MovieBooking.sevice;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.repository.ScreenRepo;
import com.Atyeti.MovieBooking.repository.SeatsRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class ScreenService {

    @Autowired
    ScreenRepo screenRepo;
     @Autowired
    SeatsRepo seatsRepo;

    public Screen addScreensInMultiplex(@NonNull Multiplex multiplex, @NonNull String screenName) {
        String screenId = UUID.randomUUID().toString();
        Screen screen = screenRepo.createScreen(screenId, screenName, multiplex);
        if(screen ==null)
            throw new NullPointerException();
        else {
            multiplex.addScreens(screen);
            return screen;
        }
    }
    public Screen getScreen(String screenId)
    {
        return screenRepo.getScreen(screenId);
    }

    public Seat createSeatInScreen(@NonNull Integer rowNo, @NonNull Integer seatNo, @NonNull String screenId) {
        Screen screen = screenRepo.getScreen(screenId);
        String seatId = UUID.randomUUID().toString();
        Seat seat = new Seat(seatId, rowNo, seatNo);
        seatsRepo.createSeat(seatId, seat);
        screen.addSeats(seat);
        return seat;
    }
    public  Seat getSeat(String showId)
    {

        Seat seat= seatsRepo.getSeat(showId);
        if(seat==null)
        {
            throw new NullPointerException();
        }
        return seat;
    }
}
