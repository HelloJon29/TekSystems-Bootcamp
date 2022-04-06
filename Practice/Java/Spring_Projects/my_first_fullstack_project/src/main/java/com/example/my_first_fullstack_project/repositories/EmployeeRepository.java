package com.example.my_first_fullstack_project.repositories;

import com.example.my_first_fullstack_project.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // this lets spring data know what this interface is
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // spring data will simplify this method for implementation later, the method name is used for that purpose in relation to Object
    Optional<Employee> findById(Long Id);

    Employee findByEmail(String email);
}
