package com.Atyeti.MovieBooking.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Getter
@Setter
public class Screen {
    private String screenID;
     private String screenName;
    private Multiplex multiplex;
     private List<Seat> seats;

    public Screen(String screenID, String screenName, Multiplex multiplex) {
        this.screenID = screenID;
        this.screenName = screenName;
        this.multiplex = multiplex;
        this.seats=new ArrayList<>();
    }
    public void addSeats(Seat seat) {
        this.seats.add(seat);
    }

    public List<Seat> getSeats()
    {
        return seats;
    }


}
