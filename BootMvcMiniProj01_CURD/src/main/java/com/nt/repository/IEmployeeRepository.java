package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {

}
