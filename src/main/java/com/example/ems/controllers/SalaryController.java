package com.example.ems.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems.entities.Salary;
import com.example.ems.serviceImpl.SalaryServicesImpl;

@RestController
@CrossOrigin
public class SalaryController {
	
	@Autowired
	private SalaryServicesImpl salaryServicesImpl;
	
	@PostMapping(path = "/addSalary")
	public Salary addSalary(@RequestBody Salary salary) {
		return salaryServicesImpl.addSalary(salary);
	}
}
