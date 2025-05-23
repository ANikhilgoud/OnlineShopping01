package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.Categories.SmartPhones;
import com.nt.service.ISmartPhoneServiceMngt;

@Controller
public class SmartPhoneController {

	@Autowired
	private ISmartPhoneServiceMngt electronicService;

	
	
//home page
	@GetMapping("/electronics")
	public String ShowElectronics( ) {
		return "electronics";
	}
		@GetMapping("/home")
		public String HomePage() {
			return "category";

	}
	//Adding smartphones into data base 
	@GetMapping("/Add_smartphones")
	public String AddElectronicItems_form(@ModelAttribute("items") SmartPhones items) {
	
		return "Add_Ele_Form";
	}
	//for saving form data 
	@PostMapping("/Add_smartphones")
	public String addElectronicItems(
	        @ModelAttribute("items") SmartPhones items,
	        @RequestParam("imagefile") MultipartFile file,
	        RedirectAttributes atts, @RequestParam(value = "lang", required = false) String lang) {

	    try {
	        if (!file.isEmpty()) {
	            items.setImage(file.getBytes());
	        }
	        String msg = electronicService.AddElectronicItem(items);
	        atts.addFlashAttribute("resultdata", msg);
	        return "redirect:electronics"; // better to redirect after POST
	    } catch (IOException e) {
	        atts.addFlashAttribute("resultdata", "Error uploading image");
	        return "redirect:electronics";
	    }
	}
	
	@GetMapping("/retriveSmartPhones")
	public String RetreiveElectronics(Map<String ,Object> map) {
		List<SmartPhones> items=electronicService.getAllItems();
		map.put("items", items);
		return "list";
	}

	}

