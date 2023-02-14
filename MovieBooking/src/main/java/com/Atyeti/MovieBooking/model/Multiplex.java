package com.Atyeti.MovieBooking.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Multiplex {
   private  String multiplexId;
    private  String multiplxName;
    private  String location;

    private final List<Screen> screens;

    public Multiplex(String multiplexId, String multipleName, String location) {
        this.multiplexId=multiplexId;
        this.multiplxName = multipleName;
        this.location = location;
        this.screens = new ArrayList<>();
    }

    public void addScreens(Screen screen) {
        this.screens.add(screen);
    }


}
