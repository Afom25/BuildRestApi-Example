package com.example.restfulwebservice.helloworld;



import com.example.restfulwebservice.helloworld.HelloworldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    @GetMapping(path="/hello-bean/path-variable/{name}")
    public HelloworldBean helloworlPathVariable(@PathVariable String name){
        return new HelloworldBean(String.format("heloo,%s",name));
    }
}
