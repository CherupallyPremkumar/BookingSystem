package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;

public interface ScreenRepo {
    Screen createScreen(String screenID,String screenName, Multiplex multiplex);

    Screen getScreen(String screenId);
}
