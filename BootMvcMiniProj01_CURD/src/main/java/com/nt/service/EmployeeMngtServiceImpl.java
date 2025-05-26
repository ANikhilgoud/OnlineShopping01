package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class EmployeeMngtServiceImpl implements IEmployeeServiceMgnt {
	@Autowired
	IEmployeeRepository emprepo;

	@Override
	public Iterable<Employee> ShowAllEmployees() {

		return emprepo.findAll();
	}

	@Override
	public String registerEmployee(Employee emp) {
		int id=emprepo.save(emp).getEmpno();
		return "Employee saved with "+id;
	}

	@Override
	public String RemoveEmployeeById(Integer Id) {
		emprepo.deleteById(Id);
		
		return Id+" Id Employee Removed";
	}

	@Override
	public String updateEmployeeData(Employee emp) {
		
		return emprepo.save(emp)+" Employee Updated";
	}

}
