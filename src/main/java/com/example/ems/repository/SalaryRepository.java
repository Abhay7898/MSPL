package com.example.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ems.entities.Salary;
@Repository
public interface SalaryRepository extends JpaRepository<Salary, Long>{

}
