package com.mms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_movie")
public class Movie {
	@jakarta.persistence.Id
	@Column(name = "movieId")
	private int movieId;
	@Column(name="movieName")
	private String movieName;
	@Column(name="movieType")
	private String movieType;
	@Column(name="movieLanguage")
	private String movieLanguage;
	@Column(name="movieDurations")
	private String movieDurations;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int movieId, String movieName, String movieType, String movieLanguage, String movieDurations) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieType = movieType;
		this.movieLanguage = movieLanguage;
		this.movieDurations = movieDurations;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public String getMovieDurations() {
		return movieDurations;
	}

	public void setMovieDurations(String movieDurations) {
		this.movieDurations = movieDurations;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieType=" + movieType
				+ ", movieLanguage=" + movieLanguage + ", movieDurations=" + movieDurations + "]";
	}
	
	
	
	
	
	

}
