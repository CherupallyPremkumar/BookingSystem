package com.Atyeti.MovieBooking.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Multiplex {
   private final String multiplexId;
    private final String multiplxName;

    private final List<Screen> screens;

    public Multiplex(String multiplexId,String multipleName) {
        this.multiplexId=multiplexId;
        this.multiplxName = multipleName;
        this.screens = new ArrayList<>();
    }

    public void addScreens(Screen screen) {
        this.screens.add(screen);
    }


}
