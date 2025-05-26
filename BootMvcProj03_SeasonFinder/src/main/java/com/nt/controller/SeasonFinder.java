package com.nt.controller;

import java.time.LocalDate;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SeasonFinder {
	@RequestMapping("/home")
	public String HomePage() {
		return "welcome";
	}
	@RequestMapping("/season")
	public String getSeason(Map<String,Object> map) {
		int month=LocalDate.now().getMonthValue();
	String result= ((month < 3 || month > 6) ? "Winter Season" : (month >= 3 && month < 6) ? "Rainy Season" : "Summer Season");
	map.put("resultmsg", result);
	return "display";
	}

}
