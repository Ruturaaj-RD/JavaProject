package com.ruturaj.employeemanagementsystem.repository;

import com.ruturaj.employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
