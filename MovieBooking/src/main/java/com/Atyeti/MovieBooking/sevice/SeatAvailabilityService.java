package com.Atyeti.MovieBooking.sevice;

import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.model.Show;
import com.Atyeti.MovieBooking.model.Ticket;
import com.Atyeti.MovieBooking.repository.ScreenRepo;
import com.Atyeti.MovieBooking.repository.TicketCounterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SeatAvailabilityService {

@Autowired
    TicketCounterRepo ticketCounterRepo;

    @Autowired
    ShowService showService;



    public List<Seat> getAvialableSeats(String showId) {
     List<Seat> seats = showService.getShow(showId).getScreen().getSeats();
      List<Seat> filledSeats =getOccupiedSeats(showService.getShow(showId));
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
