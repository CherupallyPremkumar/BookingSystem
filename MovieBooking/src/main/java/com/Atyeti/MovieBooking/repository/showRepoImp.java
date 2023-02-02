package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Show;

import java.util.HashMap;
import java.util.Map;

public class showRepoImp implements ShowRepo{
    Map<String,Show> showMap;

    public showRepoImp(Map<String, Show> showMap) {
        this.showMap = new HashMap<>();
    }
    @Override
    public void createShow(String showId, Show show) {
        showMap.put(showId,show);
    }

    @Override
    public Show getShow(String showId) {
        return showMap.get(showId);
    }

    @Override
    public Map<String,Show> getAllShow() {
       return showMap;

    }
}
