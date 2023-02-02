package com.Atyeti.MovieBooking.sevice;

import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.model.SeatLock;
import com.Atyeti.MovieBooking.model.Show;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SeatLockProvider {

    private final Integer lockTimeout;
    Map<Show, Map<Seat, SeatLock>> locks;

    public SeatLockProvider(Integer lockTimeout, Map<Show, Map<Seat, SeatLock>> locks) {
        this.lockTimeout = lockTimeout;
        this.locks = new HashMap<>();
    }

    public void lockSeats(Show show, List<Seat> seats, String user) {

        for (Seat s:seats) {
            if(isSeatLocked(show,s)){
                throw new NullPointerException();
            }
        }
        for (Seat s: seats) {
            lockSeat(show,s,user,lockTimeout);
        }
    }

    private void lockSeat(Show show, Seat s, String user, Integer lockTimeout) {
        if(!locks.containsKey(show)){
            locks.put(show,new HashMap<>());
        }
        SeatLock seatLock=new SeatLock(s,show,lockTimeout,new Date(),user);
        locks.get(show).put(s,seatLock);
    }

    private boolean isSeatLocked(Show show, Seat s) {
        if(locks.containsKey(show) && locks.get(show).containsKey(s) && locks.get(show).get(s).isLockExpired())
        {
            return true;
        }else {
            return false;
        }
    }
}
