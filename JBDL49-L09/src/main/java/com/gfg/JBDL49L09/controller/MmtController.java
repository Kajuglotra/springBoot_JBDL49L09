package com.gfg.JBDL49L09.controller;

import com.gfg.JBDL49L09.services.FlightInterface;
import com.gfg.JBDL49L09.services.GoAirServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@ResponseBody
public class MmtController {

    @Autowired
    @Qualifier("go_flight")
    FlightInterface flightInterface; // factory design pattern

    @GetMapping("/getFlights")
    public List<String> getFlightData(){
        return flightInterface.getFlightData();
    }
}
// design pattern factory design pattern -
// we tell the compiler which class implementation should be used

//@ResponseBody
//@Controller-> we are not able to get responses from it

// earlier frontend and the backend ->  both were on same server -> jsp/ servlet  -> html pages

// changes happened ->
//@RestController