package com.nathsagar.school.controller.publicapi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nathsagar.school.common.response.ApiResponse;
import com.nathsagar.school.dto.response.GalleryResponseDto;
import com.nathsagar.school.service.GalleryService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/public/gallery")
@RequiredArgsConstructor
public class GalleryController {

	private final GalleryService service;

	@GetMapping
	public ApiResponse<List<GalleryResponseDto>> getGallery() {

		log.info("Received request to fetch gallery");

		return ApiResponse.<List<GalleryResponseDto>>builder().success(true).message("Gallery fetched successfully")
				.data(service.getPublishedGallery()).build();
	}
}
