package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepository;

@Service
public class ICustomerServiceMngtImpl implements ICustomerServiceMngt {

	@Autowired
	private ICustomerRepository customerrepo;
	
	@Override
	public String registerCustomer(Customer cust) {
		int id=customerrepo.save(cust).getCid();
		return "user saved with "+id;
	}

}
