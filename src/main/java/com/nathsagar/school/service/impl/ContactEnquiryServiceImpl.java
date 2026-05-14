package com.nathsagar.school.service.impl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.nathsagar.school.dto.request.ContactEnquiryRequestDto;
import com.nathsagar.school.dto.response.ContactEnquiryResponseDto;
import com.nathsagar.school.entity.ContactEnquiry;
import com.nathsagar.school.enums.EnquiryStatus;
import com.nathsagar.school.repository.ContactEnquiryRepository;
import com.nathsagar.school.service.ContactEnquiryService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ContactEnquiryServiceImpl implements ContactEnquiryService {

	private final ContactEnquiryRepository repository;

	@Override
	public ContactEnquiryResponseDto createEnquiry(ContactEnquiryRequestDto requestDto) {

		log.info("Saving contact enquiry request for phone number {}", requestDto.getPhoneNumber());
		ContactEnquiry enquiry = ContactEnquiry.builder().parentName(requestDto.getParentName())
				.phoneNumber(requestDto.getPhoneNumber()).studentStandard(requestDto.getStudentStandard())
				.message(requestDto.getMessage()).status(EnquiryStatus.NEW).createdAt(LocalDateTime.now())
				.updatedAt(LocalDateTime.now()).build();

		ContactEnquiry savedEnquiry = repository.save(enquiry);
		log.info("Successfully saved contact information request for phonr number {}", requestDto.getPhoneNumber());

		return ContactEnquiryResponseDto.builder().id(savedEnquiry.getId()).parentName(savedEnquiry.getParentName())
				.phoneNumber(savedEnquiry.getPhoneNumber()).studentStandard(savedEnquiry.getStudentStandard())
				.message(savedEnquiry.getMessage()).status(savedEnquiry.getStatus().name())
				.createdAt(savedEnquiry.getCreatedAt()).build();
	}
}
