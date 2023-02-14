package com.Atyeti.MovieBooking.sevice;

import com.Atyeti.MovieBooking.model.Movie;
import com.Atyeti.MovieBooking.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class MovieServie {

    @Autowired
     MovieRepo movieRepo;

    public Movie createMovie(String movieName) {
        String movieId= UUID.randomUUID().toString();
        Movie movie=new Movie(movieId,movieName);
        movieRepo.createMovie(movieId,movie);
        return movie;
    }

    public Movie getMovie(String movieId) {
        return movieRepo.getMovie(movieId);
    }
    public MovieRepo getMovieRepo()
    {
        return movieRepo;
    }

    public List<Movie> getAllMovie() {
        return movieRepo.getAllMovie();
    }
}
