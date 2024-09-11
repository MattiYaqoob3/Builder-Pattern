package com.example.demo.repository;

import com.example.demo.models.Borrowed;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BorrowedRepsitory extends MongoRepository<Borrowed,String> {
}
