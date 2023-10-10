package com.program.valid.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandlingException  {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> HandleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
		
		Map<String, String> map = new HashMap<>();
		
		exception.getBindingResult().getAllErrors().forEach(i -> {
			
			String key = ((FieldError)i).getField();
			String value = i.getDefaultMessage();
			map.put(key, value);
			
		});
		
		
		return new ResponseEntity<Map<String,String>>(map,HttpStatus.OK);
	}
}
