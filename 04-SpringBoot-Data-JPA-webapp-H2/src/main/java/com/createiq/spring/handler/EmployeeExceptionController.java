package com.createiq.spring.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.createiq.spring.exception.EmployeeNotFoundException;

@ControllerAdvice
public class EmployeeExceptionController {

	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity<Object> excpetion(EmployeeNotFoundException exception) {
		
		return new  ResponseEntity<>("product not found" ,HttpStatus.NOT_FOUND);
	}
}