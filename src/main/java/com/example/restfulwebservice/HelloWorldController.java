package com.example.restfulwebservice;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//REST API
@RestController

public class HelloWorldController {

    @GetMapping(path="/hello")
    public String helloworld(){
        return "Hello world HIDRI";
    }
    @GetMapping(path="/hello-bean")
    public HelloworldBean helloworldBean(){
        return new HelloworldBean(" HIDRI-BEAN");
    }
}
