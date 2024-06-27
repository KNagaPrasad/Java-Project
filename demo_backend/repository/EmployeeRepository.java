package com.example.demo_backend.repository;

import com.example.demo_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
