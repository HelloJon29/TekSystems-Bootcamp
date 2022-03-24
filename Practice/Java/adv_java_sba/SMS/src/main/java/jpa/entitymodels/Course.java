package jpa.entitymodels;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Course")
public class Course {
    // fields that are the columns of the model class
    @Id
    @Column(name = "id", nullable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY) may not need
    private int cId;

    @Column(name = "name", length = 50, nullable = false)
    private String cName;

    @Column(name = "Instructor", length = 50, nullable = false)
    private String cInstructorName;

    // No arg constructor that initializes the fields
    public Course() {
        this.cId = 0;
        this.cName = null;
        this.cInstructorName = null;
    }

    // Overloaded constructor that takes in args and sets them to the private members
    public Course(int cId, String cName, String cInstructorName) {
        this.cId = cId;
        this.cName = cName;
        this.cInstructorName = cInstructorName;
    }

    // Getters and Setters
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcInstructorName() {
        return cInstructorName;
    }

    public void setcInstructorName(String cInstructorName) {
        this.cInstructorName = cInstructorName;
    }

    // override equals and hashcode for tests

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getcId() == course.getcId() && Objects.equals(getcName(), course.getcName()) && Objects.equals(getcInstructorName(), course.getcInstructorName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getcId(), getcName(), getcInstructorName());
    }
}
