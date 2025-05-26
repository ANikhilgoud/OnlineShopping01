package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class hello {
	@GetMapping("/path")
public String get() {
	return"get";
}
}
