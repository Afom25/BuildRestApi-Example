package com.example.restfulwebservice.version;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController<Person> {

    @GetMapping("/v1/person")
        public PersonV1 getVersion(){
            return new PersonV1("Bob Charlie");
        }

    @GetMapping("/v2/person")
    public PersonV2 getVersion2(){
        return new PersonV2(new Name("Bob", "Charlie"));
    }

}
