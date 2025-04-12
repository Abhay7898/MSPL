package com.example.ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems.entities.Employee;
import com.example.ems.serviceImpl.EmployeeServicesImpl;

@RestController
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	private EmployeeServicesImpl employeeServicesImpl;
	
	@PostMapping(path = "/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeServicesImpl.addEmployee(employee);
	}
	
	@GetMapping(path = "getAllEmployeeByDesignation/{designation}")
	public List<Employee> getAllEmployeeByDesignation(@PathVariable String designation) {
		return employeeServicesImpl.getAllEmployeeByDesignation(designation);
	}
	
	@GetMapping(path = "/getEmployeeInARange/{minRange}/and/{maxRange}")
	public List<Employee> getEmployeeInARange(@PathVariable double minRange, @PathVariable double maxRange) {
		return null;
	}
}
