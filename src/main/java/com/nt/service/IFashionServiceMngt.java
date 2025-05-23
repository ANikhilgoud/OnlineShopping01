package com.nt.service;

import java.util.List;

import com.nt.Categories.Fashion;

public interface IFashionServiceMngt {
	
	public String InsertCloth(Fashion fashion);
	public List<Fashion> ReteiveCloth();
	public Fashion reteiveById(Integer Id);

}
