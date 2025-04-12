package com.example.ems.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems.entities.Department;
import com.example.ems.serviceImpl.DepartmentServicesImpl;

@RestController
@CrossOrigin
public class DepartmentController {
	@Autowired
	private DepartmentServicesImpl departmentServicesImpl;
	
	@PostMapping(path = "/addDepartment")
	public Department addDepartment(@RequestBody Department department) {
		return departmentServicesImpl.addDepartment(department);
	}
}
