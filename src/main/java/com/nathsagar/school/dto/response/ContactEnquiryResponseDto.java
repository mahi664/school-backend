package com.nathsagar.school.dto.response;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContactEnquiryResponseDto {

	private Long id;
	private String parentName;
	private String phoneNumber;
	private String studentStandard;
	private String message;
	private String status;
	private LocalDateTime createdAt;
}