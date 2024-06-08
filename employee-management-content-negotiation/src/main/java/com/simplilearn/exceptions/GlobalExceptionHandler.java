package com.simplilearn.exceptions;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ApiError> handleEmployeeNotFoundException(EmployeeNotFoundException ex,WebRequest request)
	{
		ApiError apiError = new ApiError(
				LocalDateTime.now(),
				HttpStatus.NOT_FOUND.value(),
				HttpStatus.NOT_FOUND.getReasonPhrase(),
				ex.getMessage(), 
				request.getDescription(false));
		return new ResponseEntity<>(apiError,HttpStatus.NOT_FOUND);
	
	}
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		Map<String, String> errors = new HashMap<String, String>();
		
		ex.getBindingResult().getFieldErrors().forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
		
		Map<String, Object> body = new HashMap<String, Object>();
		body.put("status", status.value());
		body.put("errors", errors);
		body.put("message", "Validation Failed");
		
		return new ResponseEntity<>(body,headers,status);
		
	}

}
