package com.project.back_end.models;

import jakarta.persistence.*;

@Entity
@Table(name = "doctors")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String specialty;

    @Column(nullable = false, unique = true)
    private String email;

    // Default Constructor (Spring Boot ke liye zaroori hai)
    public Doctor() {}

    // Constructor with parameters
    public Doctor(String name, String specialty, String email) {
        this.name = name;
        this.specialty = specialty;
        this.email = email;
    }

    // Getters and Setters (Data access ke liye)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
