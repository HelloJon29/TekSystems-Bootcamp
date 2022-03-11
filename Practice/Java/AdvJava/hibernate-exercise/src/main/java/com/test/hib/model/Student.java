package com.test.hib.model;

import javax.persistence.*;

@Entity
@Table(name = "STUDENTS")
public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String course;

    public Student() {

    }

    public Student(String firstName, String lastName, int age, String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;
    }
    // Getters and Setters
    @Column(name = "STUDENT_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
