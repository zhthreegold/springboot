package com.example.testapp.controller;

import com.example.testapp.domain.User;
import com.example.testapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value="/")
    public String home(){
        System.out.println("home page");
        String msg  = "Hello Baby";
        return msg;
    }

    @GetMapping(value="/{user_id}")
    public User getUser(@PathVariable Integer user_id){
        return userRepository.findOne(user_id);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PutMapping(value="/add")
    public void addUser(@RequestParam String name){
        System.out.println("addUser - " + name);
        User user = new User(name);
        userRepository.save(user);
    }



}
