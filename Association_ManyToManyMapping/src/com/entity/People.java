package com.entity;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;

@Entity
public class People 
{
    @Id
    private int people_id;
    private String people_name;

    @ManyToMany
    @JoinTable
    (
    	name = "People_Project",
     	joinColumns = { @JoinColumn(name = "people_id")  },
    	inverseJoinColumns = { @JoinColumn(name = "project_id")  }
    )

    private List<Projects> projects = new ArrayList<>();

    public People() 
    {
    	
    }

    public People(int people_id, String people_name, List<Projects> projects) 
    {
        this.people_id = people_id;
        this.people_name = people_name;
        this.projects = projects;
    }

    public int getPeople_id() {
        return people_id;
    }

    public void setPeople_id(int people_id) {
        this.people_id = people_id;
    }

    public String getPeople_name() {
        return people_name;
    }

    public void setPeople_name(String people_name) {
        this.people_name = people_name;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    public void addProject(Projects project) {
        this.projects.add(project);
        project.getPeople().add(this); 
    }

    @Override
    public String toString() {
        return "People [people_id=" + people_id + ", people_name=" + people_name + ", projects=" + projects + "]";
    }
}
