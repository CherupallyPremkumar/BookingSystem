package com.Atyeti.MovieBooking.model;

import lombok.Getter;
import lombok.Setter;


public class Movie {
    @Getter
   final private String movieId;
   @Getter @Setter
    private String movieName;


    public Movie(String movieName,  String movieId) {
        this.movieId = movieId;
        this.movieName = movieName;

    }


}
