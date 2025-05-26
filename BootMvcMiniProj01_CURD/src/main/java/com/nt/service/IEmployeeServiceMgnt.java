package com.nt.service;

import com.nt.entity.Employee;

public interface IEmployeeServiceMgnt {
public Iterable<Employee> ShowAllEmployees();
public String registerEmployee(Employee emp);
public String RemoveEmployeeById(Integer Id);
public String updateEmployeeData(Employee emp);
}
