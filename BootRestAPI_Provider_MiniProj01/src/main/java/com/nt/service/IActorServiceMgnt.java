package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.customException.ActorNotFoundException;
import com.nt.entity.Actor;

public interface IActorServiceMgnt {
	public String InsertActor(Actor actor);
	public String BatchInsertionOfActors(List<Actor> actors);
	public List<Actor> fetchAllActors();
	public Actor fetchById(Integer Id)throws ActorNotFoundException;
	public String deleteById(Integer id)throws ActorNotFoundException;
	public String Update(Actor actor)throws ActorNotFoundException;

}
