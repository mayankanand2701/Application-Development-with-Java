package com.springrest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StringExceptionHandler
{
	// you can handle more status code here i have only put few request here
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse> handlingException(StudentNotFoundException exp)
		{
			StudentErrorResponse error=new StudentErrorResponse();
			error.setStatus(HttpStatus.NOT_FOUND.value());
			error.setMessage(exp.getMessage());
			error.setTimeline(System.currentTimeMillis());
			return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		}
		@ExceptionHandler
		public ResponseEntity<StudentErrorResponse> handlingException(Exception exp)
		{
			StudentErrorResponse error=new StudentErrorResponse();
			error.setStatus(HttpStatus.NOT_FOUND.value());
			error.setMessage(exp.getMessage());
			error.setTimeline(System.currentTimeMillis());
			return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		}
}
