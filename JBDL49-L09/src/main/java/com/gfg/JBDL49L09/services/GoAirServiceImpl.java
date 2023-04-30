package com.gfg.JBDL49L09.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("go_flight")
public class GoAirServiceImpl implements FlightInterface{
    @Override
    public List<String> getFlightData() {
        List<String> list =new ArrayList<>();
        list.add("flight1");
        list.add("flight2");
        return list;
    }
}
