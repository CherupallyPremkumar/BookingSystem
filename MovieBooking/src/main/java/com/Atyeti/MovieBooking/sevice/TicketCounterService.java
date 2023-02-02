package com.Atyeti.MovieBooking.sevice;

import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.model.Show;
import com.Atyeti.MovieBooking.repository.TicketCounterRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class TicketCounterService {

    @Autowired
    private ShowService showService;
    @Autowired
    private ScreenService screenService;
    @Autowired
    private SeatAvailabilityService seatAvailabilityService;

    TicketCounterRepo ticketCounterRepo;



    public void createBooking(String userId, String showId, List<String> seatsId) {

        Show show=showService.getShow(showId);
      List<Seat> seats=  seatsId.stream().map(screenService::getSeat).collect(Collectors.toList());
      if(isSeatsAllocated(show,seats))
      {

      }
      seatLockProvider.lockSeats(show,seats,userId);



    }

    private boolean isSeatsAllocated(Show show, List<Seat> seats) {

        checkBookedSeatsAllocated(show);

    }

    private List<Seat> checkBookedSeatsAllocated(Show show) {

        getAllBookedSeats(show);
    }

    public List<Seat> getAllBookedSeats(Show show)
    {
        return seatAvailabilityService.getAvialableSeats();
    }
}
