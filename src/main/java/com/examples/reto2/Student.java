/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examples.reto2;

import java.util.List;

/**
 *
 * @author osgod
 */
public class Student {
    private String name;
    private String[] course;
    //private List <String> course;
    private String campus;
    private String email;
    
    public Student(String name, String email, String campus) {
        this.name = name;
        this.campus = campus;
        this.email = email;
    }

    public Student(String name, String[] course, String email, String campus) {
        this.name = name;
        //this.course.add(course);
        this.course = course;
        this.campus = campus;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getCourse() {
        return course;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    
    
}
