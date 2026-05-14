package com.nathsagar.school.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SchoolConfigResponseDto {

	private String schoolName;
	private String phoneNumber;
	private String email;
	private String address;
	private String principalMessage;
	private String youtubeUrl;
	private String facebookUrl;
	private String instagramUrl;
	private Boolean admissionOpen;
	private String schoolTiming;
	private String currentAcademicYear;
}
