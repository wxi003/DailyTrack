package com.example.dailytrack.model;

import jakarta.persistence.*;

/**
 * @author xiwang
 */
@Entity
public class WorkEntry{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;

    @ManyToOne
    @JoinColumn(name = "personnel_id", nullable = false)
    private Personnel personnel;
    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

    private int hoursSpent;

    // Default constructor (required by JPA)
    protected WorkEntry() {}


    public WorkEntry(String date, Personnel personnel, Project project, int hoursSpent) {
        this.date = date;
        this.personnel = personnel;
        this.project = project;
        this.hoursSpent = hoursSpent;

    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Personnel getPersonnel(){
        return personnel;
    }

    public void setPersonnel(Personnel personnel){
        this.personnel = personnel;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public int getHoursSpent() {
        return hoursSpent;
    }

    public void setHoursSpent(int hoursSpent) {
        this.hoursSpent = hoursSpent;
    }
}
