package com.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Projects 
{
    @Id
    private int project_id;
    private String project_name;

    @ManyToMany(mappedBy = "projects")
    private List<People> people = new ArrayList<>();

    public Projects() {}

    public Projects(int project_id, String project_name, List<People> people) 
    {
        this.project_id = project_id;
        this.project_name = project_name;
        this.people = people;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Projects [project_id=" + project_id + ", project_name=" + project_name + ", people=" + people + "]";
    }
}
