package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Customer;
import com.nt.service.ICustomerServiceMngt;

@Controller
public class customerController {
	
	@Autowired
private	ICustomerServiceMngt customerService;
	

	@GetMapping("/register")
	public String EmpRegisterForm(@ModelAttribute("customer") Customer cust) {
		return "Reg_form";
		
	}
		 
	@PostMapping("/register")
	public String CustomerRegistration(@ModelAttribute("Customer") Customer cust, RedirectAttributes atts, @RequestParam(value = "lang", required = false) String lang) {
		String msg = customerService.registerCustomer(cust);
		atts.addFlashAttribute("resultmsg", msg);

		return "category";

	}

}
