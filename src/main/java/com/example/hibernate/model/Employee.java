package com.example.hibernate.model;

import jakarta.persistence.*;

//@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double salary;
    @ManyToOne
    private Department department;

}
