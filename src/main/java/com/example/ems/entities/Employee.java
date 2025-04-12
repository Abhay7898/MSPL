package com.example.ems.entities;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeeId;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private LocalDate dateOfJoining;
	
	@Enumerated(EnumType.STRING)
	private Designation designationType;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	@OneToOne
	@JoinColumn(name = "salary_id")
	private Salary salary;

	public enum Designation {
		HR, MANAGAR, DEVLOPER
	}
}
