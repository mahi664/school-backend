package com.nathsagar.school.service;

import java.util.List;

import com.nathsagar.school.dto.response.GalleryResponseDto;

public interface GalleryService {

	List<GalleryResponseDto> getPublishedGallery();
}
