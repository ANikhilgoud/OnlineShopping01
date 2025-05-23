package com.nt.service;

import java.util.List;

import com.nt.Categories.HomeAppliances;

public interface IHomeAppliancesServiceMngt {
public String SaveAppliances(HomeAppliances appliances);
public List<HomeAppliances> retreiveAppliances();
public HomeAppliances retreiveById(Integer id);
}
