package com.example.dailytrack.model;

import jakarta.persistence.*;
import java.util.List;

/**
 * @author xiwang
 */

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<WorkEntry> workEntries;

    // Default constructor
    public Project() {}

    // Constructor with parameters
    public Project(String name) {
        this.name = name;
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

    public List<WorkEntry> getWorkEntries() {
        return workEntries;
    }

    public void setWorkEntries(List<WorkEntry> workEntries) {
        this.workEntries = workEntries;
    }
}

