package com.krawus.springboot.dundermifflinmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krawus.springboot.dundermifflinmanager.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
