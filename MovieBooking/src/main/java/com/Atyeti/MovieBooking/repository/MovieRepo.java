package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Movie;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface MovieRepo {

    void createMovie(String movieId,Movie movie);

    Movie getMovie(String movieId);

    List<Movie> getAllMovie();
}
