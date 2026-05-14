package com.nathsagar.school.controller.publicapi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nathsagar.school.common.response.ApiResponse;
import com.nathsagar.school.dto.response.NoticeResponseDto;
import com.nathsagar.school.service.NoticeService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/public/notices")
@RequiredArgsConstructor
public class NoticeController {

	private final NoticeService service;

	@GetMapping
	public ApiResponse<List<NoticeResponseDto>> getNotices() {

		log.info("Received request to fetch notices");

		return ApiResponse.<List<NoticeResponseDto>>builder().success(true).message("Notices fetched successfully")
				.data(service.getPublishedNotices()).build();
	}
}
