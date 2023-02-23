package com.Atyeti.MovieBooking.sevice;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.repository.ScreenRepo;
import com.Atyeti.MovieBooking.repository.SeatsRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
@Service
public class ScreenService {
@Autowired
    ScreenRepo screenRepo;
@Autowired
    SeatsRepo seatsRepo;
@Autowired
MultiplexService multiplexService;

    public Map<String, String> addScreensInMultiplexx(@NonNull String multiplexId, Screen screen) {
        Map<String, String> screenMap=new HashMap<>();
        String screenId = UUID.randomUUID().toString();
        System.out.println("this is m"+multiplexId);
        screen.setScreenID(screenId);
        System.out.println(screen.toString());
        Multiplex multiplex1=multiplexService.getmultiplex(multiplexId);
            multiplex1.addScreens(screen);
             screenMap.put("status","succesfull");
return  screenMap;
    }
    public Screen getScreen(String multiplexId)
    {
        return screenRepo.getScreen(multiplexId);
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
