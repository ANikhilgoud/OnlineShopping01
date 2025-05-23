package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Categories.HomeAppliances;
import com.nt.repository.IHomeAPPRepository;
@Service
public class IHomeAppliancesServiceMngtImpl implements IHomeAppliancesServiceMngt {
	
	@Autowired
	IHomeAPPRepository appliancesrepo;

	@Override
	public String SaveAppliances(HomeAppliances appliances) {
		int id=appliancesrepo.save(appliances).getId();
		return "added with id "+id;
	}

	@Override
	public List<HomeAppliances> retreiveAppliances() {
		
		return appliancesrepo.findAll();
	}

	@Override
	public HomeAppliances retreiveById(Integer id) {
		
		return appliancesrepo.findById(id).orElseThrow(()->(new IllegalArgumentException("Invalid id")));
	}

}
