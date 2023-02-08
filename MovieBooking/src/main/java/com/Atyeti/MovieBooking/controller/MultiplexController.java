package com.Atyeti.MovieBooking.controller;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.sevice.MultiplexService;
import com.Atyeti.MovieBooking.sevice.ScreenService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MultiplexController {
    @Autowired
    private MultiplexService multiplexService;
    @Autowired
    public ScreenService screenService;
     @PostMapping("/createMultiplex{multiplexName}")
    public Multiplex createMultiplex(@NonNull String multiplexName) {
        return multiplexService.createmultiplex(multiplexName);
    }
    @GetMapping("/getmultiplex{multiplexId}")
    public Multiplex getMultiplex(@NonNull String multiplexId) {

        return multiplexService.getmultiplex(multiplexId);
    }

    @PostMapping("/addScreen{multiplexId}{screenName}")
    public Screen addScreensInMultiplex(@NonNull @RequestParam("multiplexId") String multiplexId, @NonNull  @RequestParam("screenName") String screenName) {
        System.out.println(multiplexId);
        System.out.println(screenName);
        return screenService.addScreensInMultiplexx(multiplexId, screenName);
    }
  @PostMapping("/createSeat{rowNo}{seatNo}{screenId}")
    public Seat createSeatInScreen(@NonNull Integer rowNo, @NonNull Integer seatNo, @NonNull String screenId)
    {
        return screenService.createSeatInScreen(rowNo,seatNo,screenId);
    }


}
