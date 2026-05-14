package com.nathsagar.school.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nathsagar.school.entity.Gallery;

@Repository
public interface GalleryRepository extends JpaRepository<Gallery, Long> {

	List<Gallery> findByPublishedTrueOrderByDisplayOrderAsc();
}
