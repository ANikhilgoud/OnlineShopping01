package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Add_ProductsController {
     @GetMapping("/Add_Product")
	public String AddProduct() {
		return"Add_Product";
	}
}
