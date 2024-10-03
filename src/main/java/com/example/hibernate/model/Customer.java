package com.example.hibernate.model;

import jakarta.persistence.*;

import java.util.List;

//@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

    @OneToMany
    private List<Reservation> reservations;



}
