package com.gfg.JBDL49L09.controller;

import com.gfg.JBDL49L09.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // object gets created but with controller we can map the route with the method
@ResponseBody
public class DemoController { // object inside ioc/ bucket
    @Autowired
    Demo demo; //reference variable // field injection

    //alias -> component, controller

    // api -> is something which someone hits from outside
    // route -> map the method
    @GetMapping("/demo")
    public String getDemoData(){
//        Demo demo1 = new Demo(); // object lifecycle is handled by us
//        return demo1.toString();
//        demo-> prototype scope
        return demo.toString();
    }
}
//spring boot scan a package and it created bean ->
// 500 classes inside this package -> spring will create bean for all the classes?
// bean which has annotation of component
//component and the controller
//@ -> At symbol
//@Autowired-> ioc fetching data -> putting inside classes wherever it is required?