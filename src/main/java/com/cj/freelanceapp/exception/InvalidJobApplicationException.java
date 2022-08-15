package com.cj.freelanceapp.exception;

public class InvalidJobApplicationException extends RuntimeException {

	private static final long serialVersionUID = -3674708288620512831L;

	public InvalidJobApplicationException() {
		super();
	}

	public InvalidJobApplicationException(String message) {
		super(message);
	}

}
