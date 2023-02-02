package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Show;
import com.Atyeti.MovieBooking.model.Ticket;

import java.util.List;

public interface TicketCounterRepo {
    List<Ticket> getAllTickets(Show show);
}
