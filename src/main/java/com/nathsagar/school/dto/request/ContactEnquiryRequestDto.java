package com.nathsagar.school.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class ContactEnquiryRequestDto {

    @NotBlank(message = "Parent name is required")
    private String parentName;

    @NotBlank(message = "Phone number is required")
    @Pattern(
        regexp = "^[0-9]{10}$",
        message = "Phone number must be 10 digits"
    )
    private String phoneNumber;

    private String studentStandard;

    private String message;
}
