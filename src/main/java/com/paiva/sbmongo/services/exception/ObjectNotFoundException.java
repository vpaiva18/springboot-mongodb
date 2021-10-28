package com.paiva.sbmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String id) {
		super("Objeto nao encontrado: " + id);
	}

}
