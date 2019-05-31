package com.java.ratingservice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SC_RATING")
public class Rating {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", length=20, nullable=false, unique=true)
	private Long id;
	
	@Column(name="STARS")
	private String stars;
	
	@Column(name="BOOK_ID")
	private Long bookId;
	
	public Rating() {
		System.out.println("Rating Default Constructor");
	}
	
	public Rating(Long bookId, String stars) {
		this.bookId=bookId;
		this.stars=stars;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStars() {
		return stars;
	}

	public void setStars(String stars) {
		this.stars = stars;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
}
