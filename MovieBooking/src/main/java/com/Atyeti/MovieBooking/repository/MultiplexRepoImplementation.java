package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.exception.MultiplexAlreadyPresent;
import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MultiplexRepoImplementation implements MultiplexRepo{

    Map<String ,Multiplex> multiplexMap;

    public MultiplexRepoImplementation() {
        this.multiplexMap = new HashMap<>();
    }

    @Override
    public void createMultiplex(String multiplexId,String multiplexName,Multiplex multiplex) {

        if(multiplexMap.containsKey(multiplexName))
        {
            throw new MultiplexAlreadyPresent();
        }
        multiplexMap.put(multiplexName,multiplex);

    }

    @Override
    public Multiplex getMultiplex(String multiplexId) {

            if(multiplexMap.get(multiplexId)==null)
            {
               throw new NullPointerException();
            }

        return multiplexMap.get(multiplexId);
    }


}
