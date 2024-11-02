package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student { 
    @Id
    private int student_id;
    private String student_name;

    @OneToOne
    private Laptop laptop;

    public Student() {
    }

    public Student(int student_id, String student_name, Laptop laptop) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.laptop = laptop;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student Details:\n" +
               "Student ID       : " + student_id + "\n" +
               "Student Name     : " + student_name + "\n";
    }
}
