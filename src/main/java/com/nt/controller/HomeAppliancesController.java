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

import com.nt.Categories.HomeAppliances;
import com.nt.Categories.Laptops;
import com.nt.service.IHomeAppliancesServiceMngt;

@Controller
public class HomeAppliancesController {
@Autowired
IHomeAppliancesServiceMngt applianceService;

@GetMapping("/Add_appliances")
public String AddLaptops_form(@ModelAttribute("items") Laptops lap) {

	return "Add_Ele_Form";
}
//for saving form data 
@PostMapping("/Add_appliances")
public String addAppliances(
        @ModelAttribute("items") HomeAppliances appliances,
        @RequestParam("imagefile") MultipartFile file,
        RedirectAttributes atts) {

    try {
        if (!file.isEmpty()) {
        	appliances.setImage(file.getBytes());
        }
        String msg = applianceService.SaveAppliances(appliances);
        atts.addFlashAttribute("resultdata", msg);
        return "redirect:electronics"; // better to redirect after POST
    } catch (IOException e) {
        atts.addFlashAttribute("resultdata", "Error uploading image");
        return "redirect:electronics";
    }
}

@GetMapping("/retrive_appliances")
public String RetreiveLaptops(Map<String ,Object> map) {
	List<HomeAppliances> items=applianceService.retreiveAppliances();
	map.put("items", items);
	return "list";
}
}
