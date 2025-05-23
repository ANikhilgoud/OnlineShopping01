package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.Categories.Fashion;
import com.nt.Categories.HomeAppliances;
import com.nt.Categories.Laptops;
import com.nt.Categories.SmartPhones;
import com.nt.service.IFashionServiceMngt;
import com.nt.service.IHomeAppliancesServiceMngt;
import com.nt.service.ILaptopsServiceMngt;
import com.nt.service.ISmartPhoneServiceMngt;

@Controller
public class BuyController {
	@Autowired
	ISmartPhoneServiceMngt samrtphoneservice;

	@Autowired
	ILaptopsServiceMngt laptopservice;

	@Autowired
	IHomeAppliancesServiceMngt applianceService;

	@Autowired
	IFashionServiceMngt fashionservice;

	@GetMapping("/buynow")
	public String Buy(@RequestParam Integer id, @RequestParam String category, Map<String, Object> map) {

		switch (category.toLowerCase()) {
		case "fashion":
			Fashion fashion = fashionservice.reteiveById(id);
			map.put("items", fashion);
			
			break;
			
		case "homeAppliences":	
			HomeAppliances homeapp=	applianceService.retreiveById(id);
			map.put("items", homeapp);
			
			break;
			
		case "laptops":	
			Laptops lap=laptopservice.retriveById(id);
			map.put("items", lap);
			break;
		case "smartphones":
			SmartPhones sp=samrtphoneservice.retreiveById(id);
			map.put("items", sp);
		}

	return "buy-page";
	}
}
