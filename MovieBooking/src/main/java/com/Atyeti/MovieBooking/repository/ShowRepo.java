package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Show;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Map;
@Component
public interface ShowRepo {


    void createShow(String showId, Show show);

    Show getShow(String showId);

    Map<String,Show> getAllShow();
}
