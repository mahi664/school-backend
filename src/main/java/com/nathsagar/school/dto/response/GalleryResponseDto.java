package com.nathsagar.school.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GalleryResponseDto {

	private Long id;

	private String title;

	private String imageUrl;

	private String category;

	private Boolean featured;

	private String youtubeLink;
}
