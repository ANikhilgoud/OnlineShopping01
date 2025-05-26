package com.nt.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Actor;
import com.nt.service.IActorMngtService;

@RestController
@RequestMapping("/actor")
public class ActorOperationController {
	@Autowired
	private IActorMngtService actorService;
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody Actor actor){
		try {
		String msg=actorService.InsertActor(actor);
		return new ResponseEntity<String> (msg,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<String> ("Problem in register",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
