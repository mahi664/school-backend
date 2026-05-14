package com.nathsagar.school.service.impl;

import org.springframework.stereotype.Service;

import com.nathsagar.school.dto.response.SchoolConfigResponseDto;
import com.nathsagar.school.entity.SchoolConfig;
import com.nathsagar.school.repository.SchoolConfigRepository;
import com.nathsagar.school.service.SchoolConfigService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class SchoolConfigServiceImpl implements SchoolConfigService {

	private final SchoolConfigRepository repository;

	@Override
	public SchoolConfigResponseDto getSchoolConfig() {

		log.info("Fetching school configuration");

		SchoolConfig config = repository.findAll().stream().findFirst()
				.orElseThrow(() -> new RuntimeException("School config not found"));

		return SchoolConfigResponseDto.builder().schoolName(config.getSchoolName()).phoneNumber(config.getPhoneNumber())
				.email(config.getEmail()).address(config.getAddress()).principalMessage(config.getPrincipalMessage())
				.youtubeUrl(config.getYoutubeUrl()).facebookUrl(config.getFacebookUrl())
				.instagramUrl(config.getInstagramUrl()).admissionOpen(config.getAdmissionOpen())
				.schoolTiming(config.getSchoolTiming()).currentAcademicYear(config.getCurrentAcademicYear()).build();
	}
}