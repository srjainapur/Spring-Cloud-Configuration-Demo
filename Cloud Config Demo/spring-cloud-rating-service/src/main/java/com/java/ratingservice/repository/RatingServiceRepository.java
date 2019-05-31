package com.java.ratingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.ratingservice.bean.Rating;

@Repository
public interface RatingServiceRepository extends JpaRepository<Rating, Long> {

}
