package com.Atyeti.MovieBooking.controller;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import com.Atyeti.MovieBooking.sevice.MovieServie;
import com.Atyeti.MovieBooking.sevice.MultiplexService;
import com.Atyeti.MovieBooking.sevice.ShowService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public class ShowController {
    @Autowired
    private ShowService showService;
    @Autowired
    MovieServie movieServie;

    MultiplexService multiplexService;

    public String createShow(String movieId, String screenId, Date startTime ,Integer durationInseconds)
    {
        return showService.createShow(movieId,screenId,startTime,durationInseconds).getShowId();
    }
    public List<String> getAvailableSeats(final String showId)
    {
        showService.getAvailableSeats(showId);
    }
}
