package com.Atyeti.MovieBooking.model;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@ToString
@Data
public class Screen {
    private String screenID;
    final private String screenName;
    private Multiplex multiplex;
     private List<Seat> seats;

    public Screen(String screenID, String screenName, Multiplex multiplex) {
        this.screenID = screenID;
        this.screenName = screenName;
        this.multiplex = multiplex;
    }
    public void addSeats(Seat seat) {
        this.seats.add(seat);
    }

    public List<Seat> getSeats()
    {
        return seats;
    }
}
