package com.example.hibernate.model;

import jakarta.persistence.*;

@Entity
public class Major {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    @OneToOne(mappedBy = "major")
    private Student student;
}
