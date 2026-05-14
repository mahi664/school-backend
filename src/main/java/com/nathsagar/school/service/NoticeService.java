package com.nathsagar.school.service;

import java.util.List;

import com.nathsagar.school.dto.response.NoticeResponseDto;

public interface NoticeService {

	List<NoticeResponseDto> getPublishedNotices();
}
