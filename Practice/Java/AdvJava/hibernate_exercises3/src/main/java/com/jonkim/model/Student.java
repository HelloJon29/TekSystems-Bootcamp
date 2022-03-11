package com.jonkim.model;

import javax.persistence.*;

@Entity
@Table(name = "Students")
// Start list with NamedQueries({}) then populate with each NamedQuery
@NamedQueries({
        @NamedQuery(name = "getRowsLessThanX", query = "FROM Student WHERE id < 5"),
        @NamedQuery(name = "getMaxAge", query = "SELECT MAX(S.age) FROM Student S")
})

public class Student {

    @Column(name = "STUDENT_ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
