package com.nathsagar.school.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nathsagar.school.entity.Notice;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {

	List<Notice> findByPublishedTrueAndExpiryDateAfterOrExpiryDateIsNull(LocalDate currentDate);
}