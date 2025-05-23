package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nt.service.IFashionServiceMngt;
import com.nt.service.IHomeAppliancesServiceMngt;
import com.nt.service.ILaptopsServiceMngt;
import com.nt.service.ISmartPhoneServiceMngt;

@Controller
public class ConfirmPurchaseController {
	

	@GetMapping("/confirmPurchase")
	public String confirmPurchase() {
	    return "confirmation-page";
	}

}
