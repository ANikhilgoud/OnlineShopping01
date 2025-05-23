package com.nt.service;

import java.util.List;

import com.nt.Categories.SmartPhones;

public interface ISmartPhoneServiceMngt {
	public String AddElectronicItem(SmartPhones items);

	public List<SmartPhones> getAllItems();
	public SmartPhones retreiveById(Integer id);
}
