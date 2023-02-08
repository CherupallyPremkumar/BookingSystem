package com.Atyeti.MovieBooking.controller;

import com.Atyeti.MovieBooking.model.Movie;
import com.Atyeti.MovieBooking.sevice.MovieServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MovieController {
    @Autowired
    MovieServie movieServie;

    @PostMapping("/createMovie{movieName}")
    public Movie createMovie(String movieName)
    {
        return movieServie.createMovie(movieName);
    }
    @GetMapping("getMovie{movieId}")
    public Movie getMovie(String movieId)
    {
        return movieServie.getMovie(movieId);
    }
}
