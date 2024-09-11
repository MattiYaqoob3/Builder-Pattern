package com.example.demo.services;

import com.example.demo.models.Users;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServices {


    @Autowired
    UsersRepository usersRepository;


    public Users createUser(Users users){
        return usersRepository.save(users);
    }

    public List<Users> findAllUsers(){
        return usersRepository.findAll();
    }

    public Users findOne(String id){
        return usersRepository.findById(id).get();
    }

    public Users updateUser(Users users){
        return usersRepository.save(users);
    }

    public String deleteUser(String id){
        usersRepository.deleteById(id);
        return "Deleted successfully!";
    }
}
