package com.example.ems.service;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.engine.jdbc.mutation.spi.BindingGroup;

import com.example.ems.entities.Employee;

public interface EmployeeServices {
	public Employee addEmployee(Employee employee);
	public List<Employee> getAllEmployeeByDesignation(String designation);
	public List<Employee> getEmployeeInARange(double minRange, double maxRange);
}
