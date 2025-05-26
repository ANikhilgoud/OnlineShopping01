package com.nt.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.customException.ActorNotFoundException;
import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Service
public class IActorServiceMngtImpl implements IActorServiceMgnt {
	@Autowired
	private IActorRepository actorRepo;

	@Override
	public String InsertActor(Actor actor) {
		int id = actorRepo.save(actor).getAid();
		return "Actor Registered with " + id;
	}

	
	@Override
	public String BatchInsertionOfActors(List<Actor> actors) {
		Iterable<Actor> iterable=actorRepo.saveAll(actors);
		List<Integer> ids=StreamSupport.stream(iterable.spliterator(), false).map(Actor::getAid).collect(Collectors.toList());
		return ids.size()+" no of Actors are registered with ids "+ids;
	}
	
	
	@Override
	public List<Actor> fetchAllActors() {
		List<Actor> actors=(List<Actor>) actorRepo.findAll();
		return actors;
	}


	@Override
	public Actor fetchById(Integer id) throws ActorNotFoundException {
	    return actorRepo.findById(id)
	        .orElseThrow(()-> new ActorNotFoundException(id + " actor not found"));
	}


	@Override
	public String deleteById(Integer id)throws ActorNotFoundException {
		if(actorRepo.findById(id).isPresent()) {
		actorRepo.deleteById(id);
		return id+" id value Actor Removed";
		}
		else {
		throw new ActorNotFoundException("invalid id");
		}
		
	}


	@Override
	public String Update( Actor actor) throws ActorNotFoundException {
	Optional<Actor> opt= actorRepo.findById(actor.getAid());
	if(opt.isPresent()) {
		actorRepo.save(actor);
		return actor.getAid()+" actor data updated";
	}
	else
		throw new ActorNotFoundException("actor not found");
		
	}

	

	

}
