package com.nathsagar.school.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nathsagar.school.dto.response.NoticeResponseDto;
import com.nathsagar.school.entity.Notice;
import com.nathsagar.school.repository.NoticeRepository;
import com.nathsagar.school.service.NoticeService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class NoticeServiceImpl implements NoticeService {

	private final NoticeRepository repository;

	@Override
	public List<NoticeResponseDto> getPublishedNotices() {

		log.info("Fetching published notices");

		List<Notice> notices = repository.findByPublishedTrueAndExpiryDateAfterOrExpiryDateIsNull(LocalDate.now());

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");

		return notices.stream()

				// latest first
				.sorted(Comparator.comparing(Notice::getCreatedAt).reversed())

				.map(notice ->

				NoticeResponseDto.builder().id(notice.getId()).title(notice.getTitle())
						.description(notice.getDescription())

						// frontend compatibility
						.category(notice.getCategory().name().toLowerCase())

						.publishDate(notice.getCreatedAt().format(formatter))

						.isPinned(notice.getImportant())

						// new for last 7 days
						.isNew(notice.getCreatedAt().toLocalDate().isAfter(LocalDate.now().minusDays(7)))

						.build())

				.toList();
	}
}
