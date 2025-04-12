package com.example.ems.serviceImpl;

import org.aspectj.lang.reflect.DeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ems.entities.Department;
import com.example.ems.repository.DepartmentRepository;
import com.example.ems.service.DepartmentServices;

@Service
public class DepartmentServicesImpl implements DepartmentServices{
	
	@Autowired
	private DepartmentRepository departmentSerRepository;
	
	@Override
	public Department addDepartment(Department department) {
		return departmentSerRepository.save(department);
	}

}
