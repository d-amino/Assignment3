package com.example.hibernate.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;

    @OneToOne
    private Major major;

}
