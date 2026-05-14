package com.nathsagar.school.common.response;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ValidationErrorResponse {

	private boolean success;
	private String message;
	private List<String> errors;
}
