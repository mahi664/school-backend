package com.nathsagar.school.entity;

import java.time.LocalDateTime;

import com.nathsagar.school.enums.GalleryCategory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "gallery")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Gallery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String title;

	@Column(name = "image_url")
	private String imageUrl;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private GalleryCategory category;

	private Boolean featured;

	@Column(name = "youtube_link")
	private String youtubeLink;

	@Column(name = "display_order")
	private Integer displayOrder;

	private Boolean published;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
}
