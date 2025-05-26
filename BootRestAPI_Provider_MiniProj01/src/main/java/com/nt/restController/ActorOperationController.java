package com.nt.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Actor;
import com.nt.service.IActorServiceMgnt;

@RestController
@RequestMapping("/actor-api")
public class ActorOperationController {

	@Autowired
	private IActorServiceMgnt actorService;

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody Actor actor) {
		try {
			String msg = actorService.InsertActor(actor);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("problem in registration ", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PostMapping("/registerAll")
	public ResponseEntity<String> BatchRegistration(@RequestBody List<Actor> actors) {
		try {
			String msg = actorService.BatchInsertionOfActors(actors);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("problem in registration", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/findAll")
	public ResponseEntity<?> fetchAllActors() {
		try {

			List<Actor> actors = actorService.fetchAllActors();
			return new ResponseEntity<List<Actor>>(actors, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("problem in fetching", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<?> fetchById(@PathVariable("id") Integer id) {
		try {
			Actor actor = actorService.fetchById(id);
			return new ResponseEntity<Actor>(actor, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> removeById(@PathVariable("id") Integer id) {
		try {
			String msg = actorService.deleteById(id);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("problem in removing", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/update")
	public ResponseEntity<String> edit(@RequestBody Actor actor) {
		try {
			String msg = actorService.Update(actor);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("update unsuccessful", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
