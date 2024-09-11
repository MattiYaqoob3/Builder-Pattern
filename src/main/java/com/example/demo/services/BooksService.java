package com.example.demo.services;

import com.example.demo.models.Books;
import com.example.demo.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;



    public Books createBooks(Books books){
        return booksRepository.save(books);
    }

    public List<Books> findAllBooks(){
        return booksRepository.findAll();
    }



    public Books findOne (String id){
        return booksRepository.findById(id).get();
    }


    public Books updateBooksList(Books books){
        return booksRepository.save(books);
    }

    public String deleteBook(String id){
        booksRepository.deleteById(id);
        return "Deleted successfully!";
    }


}
