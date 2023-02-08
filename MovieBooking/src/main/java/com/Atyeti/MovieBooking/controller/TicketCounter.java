package com.Atyeti.MovieBooking.controller;

import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.model.Ticket;
import com.Atyeti.MovieBooking.sevice.SeatAvailabilityService;
import com.Atyeti.MovieBooking.sevice.ShowService;
import com.Atyeti.MovieBooking.sevice.TicketCounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController

public class TicketCounter {

    @Autowired
    SeatAvailabilityService seatAvailabilityService;

    @Autowired
    private TicketCounterService ticketCounterService;
    @PostMapping("/createTicket/{userId}{showId}{seatsId}")
    public Ticket createTicket(String userId, String showId, List<String> seatsId)
    {
        return ticketCounterService.createTicket(userId,showId,seatsId);
    }
    @GetMapping("getAlvailableSeats/{showId}")
    public List<Seat> getAvailableSeats(final String showId)
    {
        return seatAvailabilityService.getAvialableSeats(showId);
    }
}
