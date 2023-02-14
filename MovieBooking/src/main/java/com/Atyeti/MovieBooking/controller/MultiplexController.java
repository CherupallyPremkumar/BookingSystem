package com.Atyeti.MovieBooking.controller;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.sevice.MultiplexService;
import com.Atyeti.MovieBooking.sevice.ScreenService;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin("*")
@Slf4j
public class MultiplexController {
    @Autowired
    private MultiplexService multiplexService;
    @Autowired
    public ScreenService screenService;
     @PostMapping("/createMultiplex")
    public Map<String,String> createMultiplex(@NonNull @RequestBody Multiplex multiplex) {
        return multiplexService.createmultiplex(multiplex);
    }
    @GetMapping("/getmultiplex{multiplexId}")
    public Multiplex getMultiplex(@NonNull @PathVariable String multiplexId) {

        return multiplexService.getmultiplex(multiplexId);
    }
    @GetMapping("/getAllmultiplex")
    public List<Multiplex> getMultiplex() {
        log.info("entered getAllMultiplex method");
        return multiplexService.getAllmultiplex();
    }
    @PostMapping("/addScreen")
    public Screen addScreensInMultiplex(@NonNull String multiplexID, @RequestBody Screen screen) {

        return screenService.addScreensInMultiplexx(multiplexID,screen);
    }
  @PostMapping("/createSeat{rowNo}{seatNo}{screenId}")
    public Seat createSeatInScreen(@NonNull Integer rowNo, @NonNull Integer seatNo, @NonNull String screenId)
    {
        return screenService.createSeatInScreen(rowNo,seatNo,screenId);
    }


}
