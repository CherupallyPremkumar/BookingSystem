package com.Atyeti.MovieBooking.sevice;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import com.Atyeti.MovieBooking.model.Seat;
import com.Atyeti.MovieBooking.repository.MultiplexRepo;
import com.Atyeti.MovieBooking.repository.ScreenRepo;
import com.Atyeti.MovieBooking.repository.SeatsRepo;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MultiplexService {

    @Autowired
    MultiplexRepo multiplexRepo;
    @Autowired
    ScreenRepo screenRepo;
    @Autowired
    SeatsRepo seatsRepo;

    public Multiplex createmultiplex(@NonNull String multiplexName) {
        String multiplexId = UUID.randomUUID().toString();
        Multiplex multiplex = new Multiplex(multiplexId, multiplexName);
        multiplexRepo.createMultiplex(multiplexId, multiplexName, multiplex);
        return multiplex;
    }

    public Multiplex getMultiplex(@NonNull String multiplexId) {
        return multiplexRepo.getMultiplex(multiplexId);
    }





}
