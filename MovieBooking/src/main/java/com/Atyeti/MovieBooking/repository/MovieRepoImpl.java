package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Movie;
import com.Atyeti.MovieBooking.model.Screen;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MovieRepoImpl implements MovieRepo{

     Map<String,Movie> movieMap =new HashMap<>();



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

    @Override
    public List<Movie> getAllMovie() {
        List<Movie> movies=new ArrayList<>();

        for (Movie m : movieMap.values()) {
            movies.add(m);
        }
        System.out.println(movies.size());
        return movies;
    }
}
