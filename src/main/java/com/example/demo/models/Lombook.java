package com.example.demo.models;

public class Lombook {


    public static void main(String[] args){


        Users users = new Users.UserBuilder()
                .setUsername("Matti")
                .setPassword("123")
                .build();

        System.out.println("asdasd");
        System.out.println(users);


        // this to usee the lombook

        Ship ship = Ship.builder()
                .from("adam")
                .to("nyklas")
                .build();


    }



}
