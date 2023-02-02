package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Seat;

import java.util.HashMap;
import java.util.Map;

public class SeatsRepoImpl implements SeatsRepo{

    Map<String,Seat> seatMap;

    public SeatsRepoImpl(Map<String, Seat> seatMap) {
        this.seatMap = new HashMap<>();
    }

    @Override
    public String createSeat(String seatId, Seat seat) {
        seatMap.put(seatId,seat);
        return seatId;
    }

    @Override
    public Seat getSeat(String showId) {
       return seatMap.get(showId);
    }
}
