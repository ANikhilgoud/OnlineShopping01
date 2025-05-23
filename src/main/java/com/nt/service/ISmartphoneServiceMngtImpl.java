package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Categories.SmartPhones;
import com.nt.repository.ISmartPhonesRepository;
@Service
public class ISmartphoneServiceMngtImpl implements ISmartPhoneServiceMngt {
	
	@Autowired
	private ISmartPhonesRepository sprepo;
	
	@Override
	public String AddElectronicItem(SmartPhones items) {
		
		int id=sprepo.save(items).getId();
		return "product Added With id "+id;
	}

	@Override
	public List<SmartPhones> getAllItems() {
		List<SmartPhones> items=sprepo.findAll();
		return items;
	}

	@Override
	public SmartPhones retreiveById(Integer id) {
		
		return sprepo.findById(id).orElseThrow(()->(new IllegalArgumentException("Invalid id")));
	}

	

}
