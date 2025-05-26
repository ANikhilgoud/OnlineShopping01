package com.nt.restController;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/season")
public class SeasonFinder {
	
	
	@GetMapping("/finder")
	public ResponseEntity<String> showSeason(){
		int month= LocalDate.now().getMonthValue();
		String season=null;
		if (month>=1 && month<=3) {
			season="winter";
		}
		else if (month>=4 && month<=6) {
			season="rainy";
		}
		else if (month>=7 && month<=12) {
			season="summer";
		}
		else 
			season="spring";
		
		return new ResponseEntity<String>(season,HttpStatus.OK);
	}

}
