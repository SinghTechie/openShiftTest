package com.abhi.openShift.openShiftTest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome in First OpenShift Test Application";
    }

    @GetMapping("/{name}")
    public String getName(@PathVariable String name){
        return "Welcome" +name;
    }
}
