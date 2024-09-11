package com.example.demo.models;

import org.springframework.boot.autoconfigure.SpringBootApplication;


public class Users {


    private String UserName;
    private String Password;


    private Users (UserBuilder builder) {
       this.UserName = builder.UserName;
       this.Password = builder.Password;
    }


    // this is builder class
    public static class UserBuilder{

        private String UserName;
        private String Password;



        public UserBuilder(String userName, String password) {
            UserName = userName;
            Password = password;
        }

        public UserBuilder() {

        }

        public UserBuilder setUsername(String userName){
            this.UserName = userName;
            return this;
        }
        public UserBuilder setPassword(String password){
            this.Password = password;
            return this;
        }

        public Users build(){
            return new Users(this);
        }
    }


    @Override
    public String toString() {
        return "Users{" +
                "UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }



}
