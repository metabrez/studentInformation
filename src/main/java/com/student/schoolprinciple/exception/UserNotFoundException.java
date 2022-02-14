package com.student.schoolprinciple.exception;

public class UserNotFoundException  extends RuntimeException{

	public UserNotFoundException(String message) {
		super(message);
	}
}
