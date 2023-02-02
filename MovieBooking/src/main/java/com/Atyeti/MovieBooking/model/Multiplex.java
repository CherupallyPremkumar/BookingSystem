package com.Atyeti.MovieBooking.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class Multiplex {
   private String multiplexId;
    private final String multiplxName;

    private List<Screen> screens;

    public Multiplex(String multiplexId,String multipleName) {
        this.multiplexId=multiplexId;
        this.multiplxName = multipleName;
        this.screens = new ArrayList<>();
    }

    public void addScreens(Screen screen) {
        this.screens.add(screen);
    }

    @Override
    public String toString() {
        return "Multiplex{" +
                "screens=" + screens +
                '}';
    }
}
