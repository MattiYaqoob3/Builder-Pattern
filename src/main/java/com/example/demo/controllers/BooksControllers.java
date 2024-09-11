package com.example.demo.controllers;

import com.example.demo.models.Books;
import com.example.demo.services.BooksService;
import com.example.demo.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BooksControllers {
    @Autowired
    BooksService booksService;

    @Autowired
    UsersServices usersServices;



    // Post a new book
    @PostMapping("/add")
    public Books createBooks(@RequestBody Books books) {
        return booksService.createBooks(books);
    }

    // Find by id

    @GetMapping("/find/{id}")
    public Books findOne(@PathVariable String id) {
        return booksService.findOne(id);
    }

    //find a list
    @GetMapping("/find")
    public List<Books> findAllBooks() {
        return booksService.findAllBooks();
    }

    //update by id
    @PutMapping("/update/{id}")
    public Books updateBooksList(@RequestBody Books books, @PathVariable("id") String _id) {
        return booksService.updateBooksList(books);
    }

    //delete using id
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable String id) {
        return booksService.deleteBook(id);
    }







}
