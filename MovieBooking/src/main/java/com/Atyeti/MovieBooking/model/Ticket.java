package com.Atyeti.MovieBooking.model;

import lombok.Getter;

import java.util.List;

@Getter
public class Ticket {
    String TicketId;
    Show show;
    List<Seat> seatsBooked;
    String user;
    BookingStatus bookingStatus;


    public Ticket(String ticketId, Show show, List<Seat> seatsBooked, String user) {
        TicketId = ticketId;
        this.show = show;
        this.seatsBooked = seatsBooked;
        this.user = user;
        this.bookingStatus = BookingStatus.Confirmed;
    }
  public boolean isConfirmed()
    {
        return this.bookingStatus==BookingStatus.Confirmed;
    }

}
