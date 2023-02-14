package com.Atyeti.MovieBooking;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.Atyeti.MovieBooking.controller.MovieController;
import com.Atyeti.MovieBooking.controller.MultiplexController;
import com.Atyeti.MovieBooking.controller.ShowController;
import com.Atyeti.MovieBooking.controller.TicketCounter;
import com.Atyeti.MovieBooking.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
class MovieBookingApplicationTests {
    @Autowired
    MultiplexController multiplexController;
    @Autowired
    MovieController movieController;

    @Autowired
    ShowController showController;
    @Autowired
    TicketCounter ticketCounter;

    @Test
    void  createMovie()
    {

        Movie happyID = movieController.createMovie("Happy");
         Movie RoboID = movieController.createMovie("Robo");
        for (Movie movie: movieController.getAllMovie()) {
            System.out.println(movie.getMovieId());
        };
       // assertEquals("RRR",movieID.getMovieName());
        assertEquals("Happy",happyID.getMovieName());
        assertEquals("Robo",RoboID.getMovieName());
    }





}
