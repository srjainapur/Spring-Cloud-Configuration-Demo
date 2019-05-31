package com.java.ratingservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.ratingservice.bean.Rating;

@Service
public interface RatingService {

	Rating saveRating(Rating rating);

	Rating getRatingById(Long id);

	List<Rating> findAllRating();
}
