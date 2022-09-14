package com.example.restfulwebservice;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController

public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET,path = "/hello")
    public String helloworld(){
        return "Hello world HIDRI";
    }
}
