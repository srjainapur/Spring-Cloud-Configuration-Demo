package com.java.ratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.ratingservice.bean.Rating;
import com.java.ratingservice.service.RatingService;

@RestController
@RequestMapping(value="/rating")
public class RatingServiceRestController {
	
	@Autowired
	private RatingService ratingService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveRating(@RequestBody Rating rating) {
		Rating ratingObj = ratingService.saveRating(rating);
		return "Rating with Id : " + ratingObj.getId() + " saved Successfully";
	}
	
	@RequestMapping(value="/getById", method=RequestMethod.GET)
	public Rating getRatingById(@RequestParam("id") Long id) {
		return ratingService.getRatingById(id);
	}
	
	@RequestMapping(value="/findAllRating", method=RequestMethod.GET)
	public List<Rating> findAllRating() {
		return ratingService.findAllRating();
	}
}
