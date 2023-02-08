package com.Atyeti.MovieBooking.sevice;

import com.Atyeti.MovieBooking.exception.SeatsAlreadyOccupiedException;
import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.model.Show;
import com.Atyeti.MovieBooking.model.Ticket;
import com.Atyeti.MovieBooking.repository.TicketCounterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class TicketCounterService {

    @Autowired
    private ShowService showService;
    @Autowired
    private ScreenService screenService;
    @Autowired
    private SeatAvailabilityService seatAvailabilityService;

    @Autowired
    TicketCounterRepo ticketCounterRepo;
    @Autowired
    SeatLockProvider seatLockProvider;


    public Ticket getTicket(String ticketID) {
        return ticketCounterRepo.getTicket(ticketID);
    }

    public Ticket createTicket(String userId, String showId, List<String> seatsId) {

        Show show = showService.getShow(showId);
        List<Seat> seats = seatsId.stream().map(screenService::getSeat).collect(Collectors.toList());
        if (isSeatsAllocated(show, seats)) {
            throw new SeatsAlreadyOccupiedException("seats already allocated for "+show.getScreen().getScreenName());
        }
        seatLockProvider.lockSeats(show, seats, userId);
        String TicketId = UUID.randomUUID().toString();
        Ticket ticket = new Ticket(TicketId, show, seats, userId);
        ticketCounterRepo.save(TicketId, ticket);
        return ticket;
    }

    private boolean isSeatsAllocated(Show show, List<Seat> seats) {

        return checkBookedSeatsAllocated(show, seats);

    }

    private boolean checkBookedSeatsAllocated(Show show, List<Seat> seats) {

        List<Seat> avialableseats = seatAvailabilityService.getAvialableSeats(show.getShowId());

        return !avialableseats.containsAll(seats);


    }

}
