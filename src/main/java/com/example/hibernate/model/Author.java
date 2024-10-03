package com.example.hibernate.model;

import jakarta.persistence.*;

//@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;

    @OneToOne
    private Book book;
}
