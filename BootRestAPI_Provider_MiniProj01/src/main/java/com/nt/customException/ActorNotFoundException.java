package com.nt.customException;

public class ActorNotFoundException extends RuntimeException{
	public ActorNotFoundException(String message) {
        super(message);
    }
}
