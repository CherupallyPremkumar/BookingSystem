package com.Atyeti.MovieBooking.sevice;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.repository.ScreenRepo;
import com.Atyeti.MovieBooking.repository.SeatsRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class ScreenService {
@Autowired
    ScreenRepo screenRepo;
@Autowired
    SeatsRepo seatsRepo;
@Autowired
MultiplexService multiplexService;

    public Screen addScreensInMultiplexx(@NonNull String multiplexId,Screen screen) {
        String screenId = UUID.randomUUID().toString();

        Multiplex multiplex1=multiplexService.getmultiplex(multiplexId);
            multiplex1.addScreens(screen);
            return screen;

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
