package com.example.demo.models;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "users")
public class Users {

    @Id
    private String id;


    private String username;


    private String password;


    private String phonenumber;


    private String address;





    public Users() {
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getAddress() {
        return address;
    }
}
