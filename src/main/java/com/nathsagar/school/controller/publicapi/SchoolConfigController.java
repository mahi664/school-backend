package com.nathsagar.school.controller.publicapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nathsagar.school.common.response.ApiResponse;
import com.nathsagar.school.dto.response.SchoolConfigResponseDto;
import com.nathsagar.school.service.SchoolConfigService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/public/config")
@RequiredArgsConstructor
public class SchoolConfigController {

	private final SchoolConfigService service;

	@GetMapping
	public ApiResponse<SchoolConfigResponseDto> getSchoolConfig() {

		log.info("Received request to fetch school config");

		return ApiResponse.<SchoolConfigResponseDto>builder().success(true)
				.message("School config fetched successfully").data(service.getSchoolConfig()).build();
	}
}
