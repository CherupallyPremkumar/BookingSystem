package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ScreenRepoIMple implements ScreenRepo{
    Map<String ,Screen> screenMap;

    public ScreenRepoIMple(Map<String, Screen> screenMap) {
        this.screenMap = new HashMap<>();
    }

    @Override
    public Screen createScreen(String screenId,String screenName, Multiplex multiplex) {
        Screen screen=new Screen(screenId,screenName,multiplex);
        screenMap.put(screenId,screen);
        return screen;
    }

    @Override
    public Screen getScreen(String screenId) {
        return screenMap.get(screenId);
    }
}
