package com.nathsagar.school.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "school_config")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SchoolConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String schoolName;

    private String phoneNumber;

    private String email;

    private String address;

    @Column(columnDefinition = "TEXT")
    private String principalMessage;

    private String youtubeUrl;

    private String facebookUrl;

    private String instagramUrl;

    private Boolean admissionOpen;

    private String schoolTiming;

    private String currentAcademicYear;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}