package com.java.ratingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.java.ratingservice.bean.Rating;
import com.java.ratingservice.repository.RatingServiceRepository;

@Service
@Qualifier("ratingService")
public class RatingServiceImpl implements RatingService {
	
	@Autowired
	private RatingServiceRepository ratingServiceRepository;
	
	@Override
	public Rating saveRating(Rating rating) {
		return ratingServiceRepository.save(rating);
	}

	@Override
	public Rating getRatingById(Long id) {
		return ratingServiceRepository.findById(id).get();
	}

	@Override
	public List<Rating> findAllRating() {
		return ratingServiceRepository.findAll();
	}
}
