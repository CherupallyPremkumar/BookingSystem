package com.Atyeti.MovieBooking.controller;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.sevice.MultiplexService;
import com.Atyeti.MovieBooking.sevice.ScreenService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MultiplexController {
    @Autowired
    private MultiplexService multiplexService;
    @Autowired
    public ScreenService screenService;

    public String createMultiplex(@NonNull String multiplexName) {
        return multiplexService.createmultiplex(multiplexName).getMultiplexId();
    }

    public Screen addScreensInMultiplex(@NonNull String multiplexId, @NonNull String screenName) {
        final Multiplex multiplex = multiplexService.getMultiplex(multiplexId);
        return screenService.addScreensInMultiplex(multiplex, screenName);
    }

    public String createSeatInScreen(@NonNull Integer rowNo, @NonNull Integer seatNo, @NonNull String screenId)
    {
        return screenService.createSeatInScreen(rowNo,seatNo,screenId).getSeatId();
    }


}
