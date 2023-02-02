package com.Atyeti.MovieBooking.sevice;

import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.model.Show;
import com.Atyeti.MovieBooking.model.Ticket;
import com.Atyeti.MovieBooking.repository.ScreenRepo;
import com.Atyeti.MovieBooking.repository.TicketCounterRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SeatAvailabilityService {


    @Autowired
    TicketCounterRepo ticketCounterRepo;



    public List<Seat> getAvialableSeats(Show show) {
     List<Seat> seats = show.getScreen().getSeats();
      List<Seat> filledSeats =getOccupiedSeats(show);
      seats.removeAll(filledSeats);
      return seats;
    }
    private List<Seat> getOccupiedSeats(Show show)
    {
            List<Ticket> tickets=  ticketCounterRepo.getAllTickets(show);
            List<Seat> seats=new ArrayList<>();
        for (Ticket t : tickets) {
            if(t.isConfirmed())
            {
                seats.addAll(t.getSeatsBooked());
            }
        }
        return seats;
    }

}
