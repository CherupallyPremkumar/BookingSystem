package com.Atyeti.MovieBooking.sevice;

import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.repository.MultiplexRepo;
import com.Atyeti.MovieBooking.repository.ScreenRepo;
import com.Atyeti.MovieBooking.repository.SeatsRepo;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
@Slf4j
public class MultiplexService {
@Autowired
    MultiplexRepo multiplexRepo;
@Autowired
    ScreenRepo screenRepo;
@Autowired
    SeatsRepo seatsRepo;

    public Map<String,String> createmultiplex(@NonNull Multiplex multiplex) {
        Map<String ,String> response=new HashMap<>();
        String multiplexId = UUID.randomUUID().toString();
        if(multiplex.getMultiplxName().equals("null"))
        {
            throw new NullPointerException();
        }

        multiplex.setMultiplexId(multiplexId);
        multiplexRepo.createMultiplex(multiplexId, multiplex);
        response.put("status","succesfull");
          return response;
    }




    public Multiplex getmultiplex(@NonNull String multiplexId) {
        return multiplexRepo.getMultiplex(multiplexId);
    }

    public List<Multiplex> getAllmultiplex() {
        log.info("entered getAllMultiplex method");
        return  multiplexRepo.getAllMultiplex();
    }
}
