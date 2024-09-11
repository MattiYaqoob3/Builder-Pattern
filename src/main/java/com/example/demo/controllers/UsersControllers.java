package com.example.demo.controllers;

import com.example.demo.models.Users;
import com.example.demo.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UsersControllers {

    @Autowired
    UsersServices usersServices;


    @PostMapping("/add")
    public Users createUser(@RequestBody Users users){
        return usersServices.createUser(users);
    }

    @GetMapping("find/{id}")
    public Users findOne(@PathVariable String id){
        return usersServices.findOne(id);
    }

    @GetMapping("/find")
    public List<Users> findAllUsers(){
        return usersServices.findAllUsers();
    }

    @PutMapping("/update/{id}")
    public Users updateUser(@RequestBody Users users, @PathVariable("id") String _id){
        return usersServices.updateUser(users);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable String id){
        return usersServices.deleteUser(id);
    }
}
