package com.nathsagar.school.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nathsagar.school.dto.response.GalleryResponseDto;
import com.nathsagar.school.entity.Gallery;
import com.nathsagar.school.repository.GalleryRepository;
import com.nathsagar.school.service.GalleryService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class GalleryServiceImpl implements GalleryService {

	private final GalleryRepository repository;

	@Override
	public List<GalleryResponseDto> getPublishedGallery() {

		log.info("Fetching gallery data");

		List<Gallery> gallery = repository.findByPublishedTrueOrderByDisplayOrderAsc();

		return gallery.stream()
				.map(item -> GalleryResponseDto.builder().id(item.getId()).title(item.getTitle())
						.imageUrl(item.getImageUrl()).category(item.getCategory().name().toLowerCase())
						.featured(item.getFeatured()).youtubeLink(item.getYoutubeLink()).build())
				.toList();
	}
}
