package com.gfg.JBDL49L09.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndigoServiceImpl implements FlightInterface{
    @Override
    public List<String> getFlightData() {
        List<String> list =new ArrayList<>();
        list.add("flight3");
        list.add("flight4");
        return list;
    }
}
