package com.Atyeti.MovieBooking.controller;

import com.Atyeti.MovieBooking.sevice.MovieServie;
import org.springframework.beans.factory.annotation.Autowired;

public class MovieController {
    @Autowired
    MovieServie movieServie;

    public String createMovie(String movieName)
    {

        return movieServie.createMovie(movieName).getMovieId();
    }
}
