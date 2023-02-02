package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import org.springframework.stereotype.Repository;

@Repository
public interface MultiplexRepo {

    void createMultiplex(String multiplexId,String multiplexname,Multiplex multiplex);

    Multiplex getMultiplex(String multiplexId);

}
