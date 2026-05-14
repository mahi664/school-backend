package com.nathsagar.school.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NoticeResponseDto {

	private Long id;

	private String title;

	private String description;

	private String category;

	private String publishDate;

	private Boolean isPinned;

	private Boolean isNew;
}