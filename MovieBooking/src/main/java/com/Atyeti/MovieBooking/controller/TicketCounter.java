package com.Atyeti.MovieBooking.controller;

import com.Atyeti.MovieBooking.sevice.ShowService;
import com.Atyeti.MovieBooking.sevice.TicketCounterService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TicketCounter {

    @Autowired
    private TicketCounterService ticketCounterService;

    public String createBooking(String userId, String showId, List<String> seatsId)
    {
        ticketCounterService.createBooking(userId,showId,seatsId);

    }




}
