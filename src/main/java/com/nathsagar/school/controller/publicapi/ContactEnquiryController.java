package com.nathsagar.school.controller.publicapi;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nathsagar.school.common.response.ApiResponse;
import com.nathsagar.school.dto.request.ContactEnquiryRequestDto;
import com.nathsagar.school.dto.response.ContactEnquiryResponseDto;
import com.nathsagar.school.service.ContactEnquiryService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/public/enquiries")
@RequiredArgsConstructor
@Slf4j
public class ContactEnquiryController {

	private final ContactEnquiryService service;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ApiResponse<ContactEnquiryResponseDto> createEnquiry(
			@Valid @RequestBody ContactEnquiryRequestDto requestDto) {

		log.info("Recieved contact enquiry request for phone number {}", requestDto.getPhoneNumber());
		ContactEnquiryResponseDto contactEnquiryResponseDto = service.createEnquiry(requestDto);
		log.info("Successfully processed contact enquiry request for {}", requestDto.getPhoneNumber());
		return ApiResponse.<ContactEnquiryResponseDto>builder().success(true)
				.message("Contact enquiry request saved successfull").data(contactEnquiryResponseDto).build();
	}
}