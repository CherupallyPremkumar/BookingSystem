package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Show;
import com.Atyeti.MovieBooking.model.Ticket;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class TicketCounterRepoImpl implements TicketCounterRepo{

        Map<String, Ticket> ticketMap;


    public TicketCounterRepoImpl(Map<String, Ticket> ticketMap) {
        this.ticketMap = ticketMap;
    }

    public List<Ticket> getAllTickets(Show show){
        List<Ticket> tickets=new ArrayList<>();

        for(Ticket ticket: ticketMap.values())
        {
            if(ticket.getShow().equals(show))
            {
                tickets.add(ticket);
            }
        }
        return tickets;
    }

    @Override
    public void save(String ticketId, Ticket ticket) {
        ticketMap.put(ticketId,ticket);
    }

    @Override
    public Ticket getTicket(String ticketID) {
        return ticketMap.get(ticketID);
    }
}
