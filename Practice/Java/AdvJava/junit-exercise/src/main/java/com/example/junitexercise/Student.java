package com.example.junitexercise;

import java.util.Locale;

public class Student {
    private String name;
    private int age;
    private String course;

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getStudentInfo() {
        return name + " is " + age + " years old";
    }

    public String getStudentCourse() {
        return course;
    }

    public String getStudentName() {
        return name.substring(0,1).toUpperCase() + name.substring(1);
    }

    public void updateName(String updateName) {
        if (updateName.length() < 4) {
            throw new NameSizeIncorrectException();
        }
    }
}
