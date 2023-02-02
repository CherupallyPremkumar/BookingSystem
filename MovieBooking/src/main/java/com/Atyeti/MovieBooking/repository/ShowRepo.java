package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Show;

import java.util.Map;

public interface ShowRepo {


    void createShow(String showId, Show show);

    Show getShow(String showId);

    Map<String,Show> getAllShow();
}
