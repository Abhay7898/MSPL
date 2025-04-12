package com.example.ems.entities;


import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table(name = "salary")
public class Salary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long salaryId;
	
	@Column(nullable = false)
	private double amount;
	
}
