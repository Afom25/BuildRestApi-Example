package com.example.restfulwebservice.helloworld;



import com.example.restfulwebservice.helloworld.HelloworldBean;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

//REST API
@RestController

public class HelloWorldController {

    private MessageSource messageSource;

    public HelloWorldController(MessageSource messageSource){
        this.messageSource = messageSource;
    }

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
    @GetMapping(path="hello-world-intertionlaized")
    public String hellowWorldInter(){
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning.message",null,"Default Message",locale);

    }
}
