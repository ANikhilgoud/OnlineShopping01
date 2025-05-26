package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepositorry;
@Service
public class IActormngtServiceImpl implements IActorMngtService {
	@Autowired
private	IActorRepositorry actorRepo;

	@Override
	public String InsertActor(Actor actor) {
		int id=actorRepo.save(actor).getAid();
		return "Actor registered with"+id;
	}

}
