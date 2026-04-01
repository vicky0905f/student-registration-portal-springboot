package com.example.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    String regId;
    int age;
    double cgpa;
    String department;
    String studentName;


    public student(int id,String regId, int age, double cgpa, String department, String studentName) {
        super();
        this.id = id;
        this.regId=regId;
        this.age = age;
        this.cgpa = cgpa;
        this.department = department;
        this.studentName = studentName;
    }


    public student() { super();
    }




}
