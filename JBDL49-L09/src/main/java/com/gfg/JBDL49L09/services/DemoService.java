package com.gfg.JBDL49L09.services;

import com.gfg.JBDL49L09.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
// will it create a bean?
public class DemoService {

    @Autowired
    Demo demo;

    public String getDemoDataService(){
        // business logic
        // like whatever we want we can do here
        return demo.toString();
    }
}

//controllers -> help with routing

// keep all the business logic inside these service classes