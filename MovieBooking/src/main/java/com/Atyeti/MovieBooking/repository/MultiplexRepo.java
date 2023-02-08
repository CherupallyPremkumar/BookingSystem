package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import lombok.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public interface MultiplexRepo {

    void createMultiplex(String multiplexId,String multiplexname,Multiplex multiplex);

    Multiplex getMultiplex(@NonNull String multiplexId);

}
