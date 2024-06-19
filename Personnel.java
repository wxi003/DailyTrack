package com.example.dailytrack.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Personnel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEntry> workEntries;

    // Default constructor
    public Personnel() {}

    // Constructor with parameters
    public Personnel(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<WorkEntry> getWorkEntries(){
        return workEntries;
    }

    public void setWorkEntries(List<WorkEntry> workEntries){
        this.workEntries = workEntries;
    }
}

