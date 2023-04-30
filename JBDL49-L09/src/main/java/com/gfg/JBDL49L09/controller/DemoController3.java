package com.gfg.JBDL49L09.controller;

import com.gfg.JBDL49L09.Demo;
import com.gfg.JBDL49L09.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Action;

@Controller
@ResponseBody
public class DemoController3 {

    //field dI
    // constructor dI
    //setter Di

    Demo demo;
    @Autowired
    DemoService service;

    @Autowired
    public void setDemo(Demo demo){
        this.demo = demo;
    }
    @GetMapping("/demo4")
    public String getDemoData(){
        return service.getDemoDataService();
    }


    // @Component 1
    // @Controller
    // @Service -> 2
    // @Repository -> 3
    // @Bean
    // @Configuration

    // shelf -> 1 to 10
//    @controller -> route
    // differentiating the different shelves


}
