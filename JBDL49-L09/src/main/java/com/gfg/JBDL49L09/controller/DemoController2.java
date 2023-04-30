package com.gfg.JBDL49L09.controller;

import com.gfg.JBDL49L09.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;

@Controller
@ResponseBody
public class DemoController2 {
    private static Logger logger = Logger.getLogger("DemoController2.class");
    Demo demo; //  reference variable

    //constructor dependency injection
    @Autowired
    public DemoController2(Demo demo){
        this.demo =demo;
    }
//    int a =10;
    //democontroller2 constructor in below case is dependent on int a
//    @Autowired
    public DemoController2(@Value("${custom.property.a}") int a){
        logger.info("I am here inside the constructor with int a type" + a);
    }
    public  DemoController2(){

    }
    @GetMapping("/demo2")
    public String getDemoData2(){
        // service method
        return demo.toString();
    }

    @GetMapping("/demo3")
    public int getDemo3(@Value("${custom.property.a}") int a){
        return a;
    }

}

// if we have multiple constructors -> Autowiring thing
// 1 constructor -> @Autowired

// bean -> object which is getting from ioc
// bean -> object /property which is getting from ioc