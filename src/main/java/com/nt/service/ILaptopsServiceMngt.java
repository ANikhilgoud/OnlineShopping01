package com.nt.service;

import java.util.List;

import com.nt.Categories.Laptops;

public interface ILaptopsServiceMngt {
	public String SaveLaptops(Laptops lap);
	public List<Laptops> retriveLaptops();
	public Laptops retriveById(Integer id);

}
