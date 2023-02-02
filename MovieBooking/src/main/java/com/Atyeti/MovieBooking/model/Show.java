package com.Atyeti.MovieBooking.model;

import lombok.Getter;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

@Getter
public class Show {
    private final String showId;
    private final Movie movie;
    private final Screen screen;
    private final Date startTime;
    private final Integer durationInseconds;


    public Show(String showId, Movie movie, Screen screen, Date startTime, Integer durationInseconds) {
        this.showId = showId;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.durationInseconds = durationInseconds;
    }

    @Override
    public String toString() {
        return "Show{" +
                "movie=" + movie +
                '}';
    }


}
