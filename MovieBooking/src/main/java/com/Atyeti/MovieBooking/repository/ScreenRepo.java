package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public interface ScreenRepo {
    Screen createScreen(String screenID,String screenName, Multiplex multiplex ,String screenType);

    Screen getScreen(String screenId);
}
