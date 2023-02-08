/*
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
        Movie movieID = movieController.createMovie("RRR");
        Movie happyID = movieController.createMovie("Happy");
         Movie RoboID = movieController.createMovie("Robo");
        assertEquals("RRR",movieID.getMovieName());
        assertEquals("Happy",happyID.getMovieName());
        assertEquals("Robo",RoboID.getMovieName());
    }



    @Test
    void  createMultiplex()
    {

       Multiplex pvrId = multiplexController.createMultiplex("PVR");
         Multiplex MirajId = multiplexController.createMultiplex("MIiraj");
        Multiplex ASAINID = multiplexController.createMultiplex("Asian");
        assertEquals("PVR",pvrId.getMultiplxName());
        assertEquals("MIiraj",MirajId.getMultiplxName());
        assertEquals("Asian",ASAINID.getMultiplxName());
    }
    @Test
    void createScreen()
    {

        Multiplex pvrId = multiplexController.createMultiplex("PVR");
        Multiplex MirajId = multiplexController.createMultiplex("MIiraj");
        Multiplex ASAINID = multiplexController.createMultiplex("Asian");
        Screen pverScrrenOne = multiplexController.addScreensInMultiplex(pvrId.getMultiplexId(), "ScreenONe");
       Screen MirajScrrenOne = multiplexController.addScreensInMultiplex(MirajId.getMultiplexId(), "ScreenONe");
       Screen AsainScrrenOne = multiplexController.addScreensInMultiplex(ASAINID.getMultiplexId(), "ScreenONe");
        Screen pverScrreTWo = multiplexController.addScreensInMultiplex(pvrId.getMultiplexId(), "ScreenTwo");
         Screen MirajScrrenTwo = multiplexController.addScreensInMultiplex(MirajId.getMultiplexId(), "ScreenTwo");
       Screen AsainScrrenTwo = multiplexController.addScreensInMultiplex(ASAINID.getMultiplexId(), "ScreenTwo");
       assertEquals("ScreenONe",pverScrrenOne.getScreenName());
        assertEquals("ScreenONe",MirajScrrenOne.getScreenName());
        assertEquals("ScreenONe",AsainScrrenOne.getScreenName());
        assertEquals("ScreenTwo",pverScrreTWo.getScreenName());
    }

    @Test
    void  createSeSeat (){
        Multiplex pvrId = multiplexController.createMultiplex("PVR");
        Multiplex MirajId = multiplexController.createMultiplex("MIiraj");
        Multiplex ASAINID = multiplexController.createMultiplex("Asian");
        Screen pverScrrenOne = multiplexController.addScreensInMultiplex(pvrId.getMultiplexId(), "ScreenONe");
        Screen MirajScrrenOne = multiplexController.addScreensInMultiplex(MirajId.getMultiplexId(), "ScreenONe");
        Screen AsainScrrenOne = multiplexController.addScreensInMultiplex(ASAINID.getMultiplexId(), "ScreenONe");
        Screen pverScrreTWo = multiplexController.addScreensInMultiplex(pvrId.getMultiplexId(), "ScreenTwo");
        Screen MirajScrrenTwo = multiplexController.addScreensInMultiplex(MirajId.getMultiplexId(), "ScreenTwo");
        Screen AsainScrrenTwo = multiplexController.addScreensInMultiplex(ASAINID.getMultiplexId(), "ScreenTwo");

       assertEquals(multiplexController.createSeatInScreen(1, 1002, pverScrrenOne.getScreenID()).getSeatNo(),1002);
       assertEquals(multiplexController.createSeatInScreen(1, 1003, pverScrrenOne.getScreenID()).getSeatNo(),1003);
       assertEquals(multiplexController.createSeatInScreen(1, 1001, pverScrrenOne.getScreenID()).getSeatNo(),1001);
      assertEquals( multiplexController.createSeatInScreen(1, 1002, pverScrrenOne.getScreenID()).getSeatNo(),1002);
      assertEquals( multiplexController.createSeatInScreen(1, 1003, pverScrrenOne.getScreenID()).getSeatNo(),1003);
      assertEquals( multiplexController.createSeatInScreen(1, 1004, pverScrrenOne.getScreenID()).getSeatNo(),1004);
      assertEquals( multiplexController.createSeatInScreen(1, 1005, pverScrrenOne.getScreenID()).getSeatNo(),1005);
      assertEquals( multiplexController.createSeatInScreen(1, 1001, MirajScrrenOne.getScreenID()).getSeatNo(),1001);
     assertEquals( multiplexController.createSeatInScreen(1, 1002, MirajScrrenOne.getScreenID()).getSeatNo(),1002);
      assertEquals( multiplexController.createSeatInScreen(1, 1003, MirajScrrenOne.getScreenID()).getSeatNo(),1003);
     assertEquals( multiplexController.createSeatInScreen(1, 1005, MirajScrrenOne.getScreenID()).getSeatNo(),1005);
     assertEquals( multiplexController.createSeatInScreen(1, 1001, AsainScrrenOne.getScreenID()).getSeatNo(),1001);
     assertEquals( multiplexController.createSeatInScreen(1, 1002, AsainScrrenOne.getScreenID()).getSeatNo(),1002);
      assertEquals( multiplexController.createSeatInScreen(1, 1003, AsainScrrenOne.getScreenID()).getSeatNo(),1003);
     assertEquals( multiplexController.createSeatInScreen(1, 1004, AsainScrrenOne.getScreenID()).getSeatNo(),1004);
      assertEquals(multiplexController.createSeatInScreen(1, 1005, AsainScrrenOne.getScreenID()).getSeatNo(),1005);
        assertEquals(multiplexController.createSeatInScreen(1, 1001, pverScrrenOne.getScreenID()).getSeatNo(),1001);
    }


    @Test
    void createShow()
    {

    }


    @Test
    void  createTicket()
    {
        Movie movieID = movieController.createMovie("RRR");
        Movie happyID = movieController.createMovie("Happy");
        Movie RoboID = movieController.createMovie("Robo");
        Multiplex pvrId = multiplexController.createMultiplex("PVR");
        Multiplex MirajId = multiplexController.createMultiplex("MIiraj");
        Multiplex ASAINID = multiplexController.createMultiplex("Asian");
        Screen pverScrrenOne = multiplexController.addScreensInMultiplex(pvrId.getMultiplexId(), "ScreenONe");
        Screen MirajScrrenOne = multiplexController.addScreensInMultiplex(MirajId.getMultiplexId(), "ScreenONe");
        Screen AsainScrrenOne = multiplexController.addScreensInMultiplex(ASAINID.getMultiplexId(), "ScreenONe");
        Screen pverScrreTWo = multiplexController.addScreensInMultiplex(pvrId.getMultiplexId(), "ScreenTwo");
        Screen MirajScrrenTwo = multiplexController.addScreensInMultiplex(MirajId.getMultiplexId(), "ScreenTwo");
        Screen AsainScrrenTwo = multiplexController.addScreensInMultiplex(ASAINID.getMultiplexId(), "ScreenTwo");
        Seat seatId1=multiplexController.createSeatInScreen(1, 1002, pverScrrenOne.getScreenID());
        Seat seatId2=multiplexController.createSeatInScreen(1, 1003, pverScrrenOne.getScreenID());
       Seat seatId3= multiplexController.createSeatInScreen(1, 1001, pverScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1002, pverScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1003, pverScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1004, pverScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1005, pverScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1001, MirajScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1002, MirajScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1003, MirajScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1005, MirajScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1001, AsainScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1002, AsainScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1003, AsainScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1004, AsainScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1005, AsainScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1001, pverScrrenOne.getScreenID());
        String show=showController.createShow(movieID.getMovieId(),pverScrrenOne.getScreenID(),new Date(),10000);
        Ticket ticket=ticketCounter.createTicket("premkumar", show,new ArrayList<>(Arrays.asList(seatId1.getSeatId(),seatId2.getSeatId(),seatId3.getSeatId())));
         assertEquals(BookingStatus.Confirmed,ticket.getBookingStatus());
    }

  @Test
    void  createTicketTwo()
    {
        Movie movieID = movieController.createMovie("RRR");
        Movie happyID = movieController.createMovie("Happy");
        Movie RoboID = movieController.createMovie("Robo");
        Multiplex pvrId = multiplexController.createMultiplex("PVR");
        Multiplex MirajId = multiplexController.createMultiplex("MIiraj");
        Multiplex ASAINID = multiplexController.createMultiplex("Asian");
        Screen pverScrrenOne = multiplexController.addScreensInMultiplex(pvrId.getMultiplexId(), "ScreenONe");
        Screen MirajScrrenOne = multiplexController.addScreensInMultiplex(MirajId.getMultiplexId(), "ScreenONe");
        Screen AsainScrrenOne = multiplexController.addScreensInMultiplex(ASAINID.getMultiplexId(), "ScreenONe");
        Screen pverScrreTWo = multiplexController.addScreensInMultiplex(pvrId.getMultiplexId(), "ScreenTwo");
        Screen MirajScrrenTwo = multiplexController.addScreensInMultiplex(MirajId.getMultiplexId(), "ScreenTwo");
        Screen AsainScrrenTwo = multiplexController.addScreensInMultiplex(ASAINID.getMultiplexId(), "ScreenTwo");
        Seat seatId1=multiplexController.createSeatInScreen(1, 1002, pverScrrenOne.getScreenID());
        Seat seatId2=multiplexController.createSeatInScreen(1, 1003, pverScrrenOne.getScreenID());
       Seat seatId3= multiplexController.createSeatInScreen(1, 1001, pverScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1002, pverScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1003, pverScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1004, pverScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1005, pverScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1001, MirajScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1002, MirajScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1003, MirajScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1005, MirajScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1001, AsainScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1002, AsainScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1003, AsainScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1004, AsainScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1005, AsainScrrenOne.getScreenID());
        multiplexController.createSeatInScreen(1, 1001, pverScrrenOne.getScreenID());
        String show=showController.createShow(movieID.getMovieId(),pverScrrenOne.getScreenID(),new Date(),10000);
        Ticket ticket=ticketCounter.createTicket("premkumar", show,new ArrayList<>(Arrays.asList(seatId1.getSeatId(),seatId2.getSeatId(),seatId3.getSeatId())));
         assertEquals(BookingStatus.Confirmed,ticket.getBookingStatus());
    }


}
*/
