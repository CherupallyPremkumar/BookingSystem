package com.Atyeti.MovieBooking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Movie {

    private String movieId;
    private String movieName;


    public Movie(String movieId,  String movieName) {
        this.movieId = movieId;
        this.movieName = movieName;

    }


}
