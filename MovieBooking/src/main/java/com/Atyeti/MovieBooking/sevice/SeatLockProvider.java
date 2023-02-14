package com.Atyeti.MovieBooking.sevice;

import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.model.SeatLock;
import com.Atyeti.MovieBooking.model.Show;
import com.Atyeti.MovieBooking.repository.SeatLockerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class SeatLockProvider {
    @Autowired
    SeatLockerRepo seatLockerRepo;

    public void lockSeats(Show show, List<Seat> seats, String user) {

        seatLockerRepo.lockSeats(show,seats,user);
    }


}
