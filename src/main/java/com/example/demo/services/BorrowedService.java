package com.example.demo.services;



import com.example.demo.models.Books;
import com.example.demo.models.Borrowed;


import com.example.demo.models.Users;
import com.example.demo.repository.BooksRepository;
import com.example.demo.repository.BorrowedRepsitory;


import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class BorrowedService {
    @Autowired
    BorrowedRepsitory borrowedRepsitory;


    @Autowired
    UsersRepository usersRepository;

    @Autowired
    BooksRepository booksRepository;




    public Borrowed createBorrowad (Borrowed borrowed){
        Users foundUser = usersRepository.findById(borrowed.getUserId())
                .orElseThrow(() -> new RuntimeException("User does not exist!"));
        Books foundBook = booksRepository.findById(borrowed.getBookId())
                .orElseThrow(() -> new RuntimeException("Book does not exist!"));
        borrowed.setUsers(foundUser);
        borrowed.setBooks(foundBook);
        return borrowedRepsitory.save(borrowed);
    }


    public List<Borrowed> findAllBorrowed(){
        return borrowedRepsitory.findAll();
    }


    public Borrowed findOne (String id){
        return borrowedRepsitory.findById(id).get();
    }


    public Borrowed updateBorrowed(Borrowed borrowed){
        Users foundUser = usersRepository.findById(borrowed.getUserId())
                .orElseThrow(() -> new RuntimeException("User does not exist!"));
        Books foundBook = booksRepository.findById(borrowed.getBookId())
                .orElseThrow(() -> new RuntimeException("Book does not exist!"));
        borrowed.setUsers(foundUser);
        borrowed.setBooks(foundBook);
        return borrowedRepsitory.save(borrowed);
    }


    public String deleteBorrowed(String id){
        borrowedRepsitory.deleteById(id);
        return "Deleted successfully!";
    }





}
