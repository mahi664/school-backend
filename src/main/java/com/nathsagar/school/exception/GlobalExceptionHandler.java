package com.nathsagar.school.exception;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nathsagar.school.common.response.ValidationErrorResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ValidationErrorResponse> handleValidationException(MethodArgumentNotValidException ex) {

		List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(error -> error.getDefaultMessage())
				.toList();

		log.error("Validation failed: {}", errors);

		ValidationErrorResponse response = ValidationErrorResponse.builder().success(false).message("Validation failed")
				.errors(errors).build();

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ValidationErrorResponse> handleGenericException(Exception ex) {

		log.error("Unexpected error occurred", ex);

		ValidationErrorResponse response = ValidationErrorResponse.builder().success(false)
				.message("Something went wrong").errors(List.of(ex.getMessage())).build();

		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
	}
}