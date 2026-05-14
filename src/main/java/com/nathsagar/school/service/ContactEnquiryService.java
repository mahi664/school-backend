package com.nathsagar.school.service;

import com.nathsagar.school.dto.request.ContactEnquiryRequestDto;
import com.nathsagar.school.dto.response.ContactEnquiryResponseDto;

public interface ContactEnquiryService {

	ContactEnquiryResponseDto createEnquiry(ContactEnquiryRequestDto requestDto);
}