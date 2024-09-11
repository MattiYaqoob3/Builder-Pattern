package com.example.demo.repository;

import com.example.demo.models.Books;
import com.example.demo.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BooksRepository extends MongoRepository<Books, String> {
}
