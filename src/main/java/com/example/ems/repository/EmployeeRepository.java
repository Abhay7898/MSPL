package com.example.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ems.entities.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	List<Employee> findEmployeeByDesignationType(String designation);
}
