package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.exception.MultiplexAlreadyPresent;
import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
@Component
public class MultiplexRepoImplementation implements MultiplexRepo{

    Map<String ,Multiplex> multiplexMap;

    public MultiplexRepoImplementation(Map<String,Multiplex> stringMultiplexMap) {
        this.multiplexMap = new HashMap<>();
    }

    @Override
    public void createMultiplex(String multiplexId,String multiplexName,Multiplex multiplex) {

        multiplexMap.put(multiplexId,multiplex);

    }
    @Override
    public Multiplex getMultiplex(@NonNull String multiplexId) {

        Multiplex multiplex= multiplexMap.get(multiplexId);
        if(multiplex!=null)
        {
            return multiplex;
        }
        else {
            throw new NullPointerException("multiplex Not found");
        }
    }


}
