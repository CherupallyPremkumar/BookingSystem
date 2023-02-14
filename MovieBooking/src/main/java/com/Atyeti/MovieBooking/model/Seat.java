package com.Atyeti.MovieBooking.model;

import lombok.Getter;
import lombok.ToString;

@Getter

public class Seat {
    String seatId;
    Integer rowNo;
    Integer seatNo;
    boolean taken;
    public Seat(String seatId,Integer rowNo,Integer seatNo ) {
        this.seatId=seatId;
        this.rowNo = rowNo;
        this.seatNo = seatNo;
        this.taken=false;
    }



}
