package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ScreenRepoIMple implements ScreenRepo{
    Map<String ,Screen> screenMap;

    public ScreenRepoIMple(Map<String, Screen> screenMap) {
        this.screenMap = new HashMap<>();
    }

    @Override
    public Screen createScreen(String screenId,String screenName, Multiplex multiplex, String screenType) {
        Screen screen=new Screen(screenId,screenName,multiplex ,screenType);
        screenMap.put(screenId,screen);
        return screen;
    }

    @Override
    public Screen getScreen(String screenId) {

       return screenMap.get(screenId);
    }
}
