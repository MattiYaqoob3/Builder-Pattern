package com.example.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "books")

public class Books {

    @Id
    private String id;


    private String bookname;


    private int numberofpages;


    private  String auther;

    private String isbn;


    private String publishyear;


    private String language;

    private int numberofbooks;

    private String shelfnumber;



    public Books() {
    }



    public String getId() {
        return id;
    }

    public String getBookname() {
        return bookname;
    }

    public int getNumberofpages() {
        return numberofpages;
    }

    public String getAuther() {
        return auther;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublishyear() {
        return publishyear;
    }

    public String getLanguage() {
        return language;
    }

    public int getNumberofbooks() {
        return numberofbooks;
    }

    public String getShelfnumber() {
        return shelfnumber;
    }
}
