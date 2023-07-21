package com.soft.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandler {

	@ExceptionHandler(SalaryException.class)

	public ResponseEntity<Object> nn(SalaryException nne) {
		return new ResponseEntity<>(nne.getMessage(), HttpStatus.NOT_FOUND);
	}

}
