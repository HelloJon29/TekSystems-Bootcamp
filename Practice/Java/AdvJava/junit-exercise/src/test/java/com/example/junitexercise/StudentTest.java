package com.example.junitexercise;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {
    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student("jon",20,"English");

    }

    @Test
    void getStudentInfo_should_return_name_and_age() {
        String studentInfo = student.getStudentInfo();
        String expectedStudentInfo = "jon is 20 years old";

        Assertions.assertThat(studentInfo).isEqualTo(expectedStudentInfo);
    }

    @Test
    void getStudentCourse_should_return_course_name_for_student() {
        String studentCourse = student.getStudentCourse();
        String expectedStudentCourse = "English";

        Assertions.assertThat(studentCourse).isEqualTo(expectedStudentCourse);

    }

    @Test
    void getStudentName_should_return_name_as_upper_case() {
        String studentName = student.getStudentName();
        String expectedStudentName = "Jon";

        Assertions.assertThat(studentName).isEqualTo(expectedStudentName);

    }

    @Test
    void updateName_should_throw_NameSizeIncorrectException_when_size_of_name_is_less_than_5() {
        org.junit.jupiter.api.Assertions.assertThrows(NameSizeIncorrectException.class,
                () -> student.updateName("zyz"));
    }
}
