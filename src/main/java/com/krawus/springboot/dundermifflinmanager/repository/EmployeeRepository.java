package com.krawus.springboot.dundermifflinmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krawus.springboot.dundermifflinmanager.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee>findAllByOrderByLastNameAsc();
    List<Employee>findAllByOrderByFirstNameAsc();
    List<Employee>findAllByOrderByEmail();
    List<Employee> findByLastName(String lastName);

}
