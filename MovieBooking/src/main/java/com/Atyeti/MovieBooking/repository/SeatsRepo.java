package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Seat;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface SeatsRepo {


    String createSeat(String seatId, Seat seat);

    Seat getSeat(String showId);
}
