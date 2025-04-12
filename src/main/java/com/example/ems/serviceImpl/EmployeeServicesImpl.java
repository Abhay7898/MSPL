package com.example.ems.serviceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.entities.Employee;
import com.example.ems.entities.Salary;
import com.example.ems.repository.EmployeeRepository;
import com.example.ems.repository.SalaryRepository;
import com.example.ems.service.EmployeeServices;

@Service
public class EmployeeServicesImpl implements EmployeeServices{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	private SalaryRepository salaryRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployeeByDesignation(String designation) {
		return employeeRepository.findEmployeeByDesignationType(designation.toUpperCase());
	}

	@Override
	public List<Employee> getEmployeeInARange(double minRange, double maxRange) {
		List<Employee> list =employeeRepository.findAll();
		List<Employee> ret =new ArrayList<>();
		for (Employee employee : list) {
			if(employee.getSalary().getAmount()>=minRange&&employee.getSalary().getAmount()>=maxRange) {
				ret.add(employee);
			}
		}
		return ret.isEmpty()?null:ret;
	}

}
