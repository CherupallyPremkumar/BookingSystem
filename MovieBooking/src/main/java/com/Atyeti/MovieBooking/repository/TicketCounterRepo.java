package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Show;
import com.Atyeti.MovieBooking.model.Ticket;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Component
public interface TicketCounterRepo {
    List<Ticket> getAllTickets(Show show);
    void save(String ticketId, Ticket ticket);
    Ticket getTicket(String ticketID);
}
