package com.nathsagar.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nathsagar.school.entity.SchoolConfig;

@Repository
public interface SchoolConfigRepository extends JpaRepository<SchoolConfig, Long> {
}