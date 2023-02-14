package com.Atyeti.MovieBooking.repository;

import com.Atyeti.MovieBooking.exception.MultiplexAlreadyPresent;
import com.Atyeti.MovieBooking.model.Multiplex;
import com.Atyeti.MovieBooking.model.Screen;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@Slf4j
public class MultiplexRepoImplementation implements MultiplexRepo{

    Map<String ,Multiplex> multiplexMap;

    public MultiplexRepoImplementation(Map<String,Multiplex> stringMultiplexMap) {
        this.multiplexMap = new HashMap<>();
    }

    @Override
    public void createMultiplex(String multiplexId,Multiplex multiplex) {

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

    @Override
    public List<Multiplex> getAllMultiplex() {
        log.info("entered into getMultiplex imp class");
        System.out.println(multiplexMap.size());
        System.out.println(new ArrayList<>(multiplexMap.entrySet().stream().map(a->a.getValue()).collect(Collectors.toList()).stream().map(a->a.getMultiplxName()).collect(Collectors.toList())));
        return new ArrayList<>(multiplexMap.values());
    }


}
