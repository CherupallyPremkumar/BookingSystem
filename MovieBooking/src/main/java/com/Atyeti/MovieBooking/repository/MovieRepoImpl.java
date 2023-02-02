package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Movie;
import com.Atyeti.MovieBooking.model.Screen;

import java.util.Map;

public class MovieRepoImpl implements MovieRepo{

    Map<String,Movie> movieMap;
    @Override
    public void createMovie(String movieId,Movie movie) {
        movieMap.put(movieId,movie);
    }

    @Override
    public Movie getMovie(String movieId) {
        if(movieMap.get(movieId)==null)
        {
            throw new NullPointerException();
        }
       return movieMap.get(movieId);
    }
}
