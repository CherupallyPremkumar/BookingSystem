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
    private String screenType;
    private List<Seat> seats;

    public Screen(String screenID, String screenName, Multiplex multiplex ,String screenType) {
        this.screenID = screenID;
        this.screenName = screenName;
        this.multiplex = multiplex;
        this.screenType=screenType;
        this.seats=new ArrayList<>();
    }
    public void addSeats(Seat seat) {
        this.seats.add(seat);
    }

    public List<Seat> getSeats()
    {
        return seats;
    }


    @Override
    public String toString() {
        return "Screen{" +
                "screenID='" + screenID + '\'' +
                ", screenName='" + screenName + '\'' +
                ", screenType='" + screenType + '\'' +
                '}';
    }
}
