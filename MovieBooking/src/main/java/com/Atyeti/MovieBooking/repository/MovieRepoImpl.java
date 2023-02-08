package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Movie;
import com.Atyeti.MovieBooking.model.Screen;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class MovieRepoImpl implements MovieRepo{

    final Map<String,Movie> movieMap;

    public MovieRepoImpl(Map<String,Movie> movieMap) {
        this.movieMap = new HashMap<>();
    }

    @Override
    public void createMovie(String movieId,Movie movie) {
        movieMap.put(movieId,movie);
    }

    @Override
    public Movie getMovie(String movieId) {
        if(movieMap.get(movieId)==null)
        {
            throw new NullPointerException("movie is not present");
        }
       return movieMap.get(movieId);
    }
}
