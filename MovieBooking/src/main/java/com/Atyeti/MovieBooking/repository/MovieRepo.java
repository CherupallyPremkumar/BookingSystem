package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Movie;

public interface MovieRepo {
    void createMovie(String movieId,Movie movie);

    Movie getMovie(String movieId);
}
