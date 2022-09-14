package com.example.restfulwebservice.User;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;

@RestController
public class UserResource {

    private UserDaoService service;

    public UserResource(UserDaoService service){
        this.service = service;
    }
    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();

    }
    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id) {
        User user = service.findOne(id);

        if (user == null)
            throw new UserNotFoundException("id:" + id);
            return user;

    }
    @DeleteMapping ("/users/{id}")
    public void deleteUser(@PathVariable int id) {
        User user = service.deleteById(id);



    }

        @PostMapping("/users")
        public ResponseEntity<User> createUser (@RequestBody User user){
            User saveUser = service.save(user);
            URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                    .buildAndExpand(saveUser.getId())
                    .toUri();
            return ResponseEntity.created(location).build();

        }
    }

