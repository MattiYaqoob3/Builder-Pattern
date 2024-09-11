package com.example.demo.models;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection = "borrowed")

public class Borrowed {


    @Id
    private String id;



    @CreatedDate
    private String create_at;



    private String deadline;



    private String userId;


    private String bookId;


    // I have this @DBRef to RF bookId from books and use it in createBorrowad in BorrowedService.
    @DBRef
    private Books books;

  // We have the same @DBRef RF for the user.
    @DBRef
    private Users users;



    public Borrowed() {
    }



    public String getId() {
        return id;
    }


    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getUserId() {
        return userId;
    }


    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }


    public String getBookId() {
        return bookId;
    }


    public String getCreate_at() {
        return create_at;
    }


    public String getDeadline() {
        return deadline;
    }




}
