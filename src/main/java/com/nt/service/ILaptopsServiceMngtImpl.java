package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Categories.Laptops;
import com.nt.repository.ILaptopRepository;

@Service
public class ILaptopsServiceMngtImpl implements ILaptopsServiceMngt {
	
	@Autowired
	ILaptopRepository Laptoprepo;

	@Override
	public String SaveLaptops(Laptops lap) {
		int id=Laptoprepo.save(lap).getId();
		return "Laptop saved with "+id;
	}

	@Override
	public List<Laptops> retriveLaptops() {
		
		return Laptoprepo.findAll();
	}

	@Override
	public Laptops retriveById(Integer id) {
		
		return Laptoprepo.findById(id).orElseThrow(()->(new IllegalArgumentException("Invalid id")));

	}

}
