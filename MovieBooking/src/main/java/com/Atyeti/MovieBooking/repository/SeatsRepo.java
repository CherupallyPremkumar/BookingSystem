package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Seat;

public interface SeatsRepo {


    String createSeat(String seatId, Seat seat);

    Seat getSeat(String showId);
}
