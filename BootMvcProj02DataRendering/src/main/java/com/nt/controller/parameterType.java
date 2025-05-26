package com.nt.controller;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class parameterType {
	@GetMapping("/process")
	public String process(Map<String,Object> map) {
		map.put("attr1", "val1");
		map.put("sydate", LocalDateTime.now());
		return"show";
	}

}
