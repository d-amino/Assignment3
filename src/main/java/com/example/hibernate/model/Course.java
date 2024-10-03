package com.example.hibernate.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {

    @Id
    private int id;
    private String name;
    private String description;

    @ManyToMany
    @JoinTable(name = "student_course",
            inverseJoinColumns = {@JoinColumn(name = "student_id")})
    private List<Student> students;

}
