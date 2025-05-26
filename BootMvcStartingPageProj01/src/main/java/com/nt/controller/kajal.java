package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class kajal {
	@GetMapping("/")
	public String getKajal() {
		return "kajal";

	}

}
