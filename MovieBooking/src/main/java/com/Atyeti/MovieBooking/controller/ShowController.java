package com.Atyeti.MovieBooking.controller;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.sevice.MovieServie;
import com.Atyeti.MovieBooking.sevice.MultiplexService;
import com.Atyeti.MovieBooking.sevice.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
@RestController

public class ShowController {
    @Autowired
    private ShowService showService;
    @Autowired
    MovieServie movieServie;
@Autowired
    MultiplexService multiplexService;


    @PostMapping("/createShow/{movieId}{screenId}{startTime},durationInseconds")
    public String createShow(String movieId, String screenId, Date startTime ,Integer durationInseconds)
    {
        return showService.createShow(movieId,screenId,startTime,durationInseconds).getShowId();
    }

}
