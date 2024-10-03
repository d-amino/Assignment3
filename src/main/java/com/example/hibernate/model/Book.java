package com.example.hibernate.model;

import jakarta.persistence.*;

//@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;

    @ManyToOne
    private Publisher publisher;
}
