package com.Atyeti.MovieBooking.controller;

import com.Atyeti.MovieBooking.model.Movie;
import com.Atyeti.MovieBooking.sevice.MovieServie;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class MovieController {
    @Autowired
    MovieServie movieServie;

    @PostMapping("/createMovie{movieName}")
    public Movie createMovie(@NonNull String movieName)
    {
        return movieServie.createMovie(movieName);
    }
    @GetMapping("/getMovie/{movieId}")
    public Movie getMovie(@NonNull @RequestParam("movieId") String movieId)
    {
        return movieServie.getMovie(movieId);

    }

    @GetMapping("/getAllMovie")
    public List<Movie> getAllMovie()
    {
        List<Movie> movies= movieServie.getAllMovie();
        System.out.println(movies.size());
        return movies;
    }
}
