package com.nathsagar.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nathsagar.school.entity.ContactEnquiry;

@Repository
public interface ContactEnquiryRepository extends JpaRepository<ContactEnquiry, Long> {
}
