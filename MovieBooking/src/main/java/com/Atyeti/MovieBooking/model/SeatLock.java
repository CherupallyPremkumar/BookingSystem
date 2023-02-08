package com.Atyeti.MovieBooking.model;

import lombok.ToString;

import java.time.Instant;
import java.util.Date;
public class SeatLock {
    private Seat seat;
    private Show show;
    private boolean timeoutInSeconds;
    private Date lockTime;
    private String lockedBy;

    public SeatLock(Seat seat, Show show, boolean timeoutInSeconds, Date lockTime, String lockedBy) {
        this.seat = seat;
        this.show = show;
        this.timeoutInSeconds = timeoutInSeconds;
        this.lockTime = lockTime;
        this.lockedBy = lockedBy;
    }


    public boolean isLockExpired()
    {
        return timeoutInSeconds;
    }
}
