package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "emp_id", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.SEQUENCE)
	private Integer Empno;
	@Column(length = 20)
	private String Ename;
	@Column(length = 20)
	private String job;
	private Float sal;
	private Integer deptno;
}
