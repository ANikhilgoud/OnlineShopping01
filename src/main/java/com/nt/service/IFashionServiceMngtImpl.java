package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Categories.Fashion;
import com.nt.repository.IFashionRepository;

@Service
public class IFashionServiceMngtImpl implements IFashionServiceMngt {
	
	@Autowired
	IFashionRepository   FashionRepo;
	

	@Override
	public String InsertCloth(Fashion fashion) {
		FashionRepo.save(fashion);
		return "Saved with id ";
	}

	@Override
	public List<Fashion> ReteiveCloth() {
		
		return FashionRepo.findAll();
	}

	@Override
	public Fashion reteiveById(Integer Id) {
		
		return FashionRepo.findById(Id).orElseThrow(()->(new IllegalArgumentException("Invalid id")));
	}

}
