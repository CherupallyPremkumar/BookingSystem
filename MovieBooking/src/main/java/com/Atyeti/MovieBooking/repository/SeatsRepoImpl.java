package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Seat;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class SeatsRepoImpl implements SeatsRepo{

    Map<String,Seat> seatMap;

    public SeatsRepoImpl() {
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
