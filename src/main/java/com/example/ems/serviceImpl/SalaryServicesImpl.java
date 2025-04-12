package com.example.ems.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.entities.Salary;
import com.example.ems.repository.SalaryRepository;
import com.example.ems.service.SalaryServices;

@Service
public class SalaryServicesImpl implements SalaryServices {
	
	@Autowired
	private SalaryRepository repository;
	
	@Override
	public Salary addSalary(Salary salary) {
		return repository.save(salary);
	}

}
