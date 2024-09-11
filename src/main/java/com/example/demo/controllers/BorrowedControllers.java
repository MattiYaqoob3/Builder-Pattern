package com.example.demo.controllers;


import com.example.demo.models.Borrowed;

import com.example.demo.services.BorrowedService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/borrowed")
public class BorrowedControllers {
    @Autowired
    BorrowedService borrowedService;




     @PostMapping("/add")
    public Borrowed createBorrowad(@RequestBody Borrowed borrowed){
        return borrowedService.createBorrowad(borrowed);
    }



    @GetMapping("/find/{id}")
    public Borrowed findOne(@PathVariable String id){
        return borrowedService.findOne(id);
    }

    @GetMapping("/all")
    public List<Borrowed> findAllBorrowed(){
        return borrowedService.findAllBorrowed();
    }

    @PutMapping("/update/{id}")
    public Borrowed updateBorrowed(@RequestBody Borrowed borrowed, @PathVariable("id") String _id){
        return borrowedService.updateBorrowed(borrowed);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteBorrowed(@PathVariable String id){
        return borrowedService.deleteBorrowed(id);
    }








}
