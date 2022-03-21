package jpa.entitymodels;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Student")
public class Student {
    // fields that are the columns of the model class
    @Id
    @Column(name = "email", length = 50, nullable = false)
    private String sEmail;

    @Column(name = "name", length = 50, nullable = false)
    private String sName;

    @Column(name = "password", length = 50, nullable = false)
    private String sPass;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_email", referencedColumnName = "email")
    private List<Course> sCourses;

    // No args constructor that initializes the fields
    public Student() {
        this.sEmail = null;
        this.sName = null;
        this.sPass = null;
        this.sCourses = null;
    }
    // Overloaded constructor that takes in arguments and sets them to the private members
    public Student(String sEmail, String sName, String sPass, List<Course> sCourses) {
        this.sEmail = sEmail;
        this.sName = sName;
        this.sPass = sPass;
        this.sCourses = sCourses;
    }

    //Getters and Setters
    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPass() {
        return sPass;
    }

    public void setsPass(String sPass) {
        this.sPass = sPass;
    }

    public List<Course> getsCourses() {
        return sCourses;
    }

    public void setsCourses(List<Course> sCourses) {
        this.sCourses = sCourses;
    }

    // Overrides for tests

}
