package com.example.demo.service;

import java.util.List;


import com.example.demo.model.Admin;


public interface AdminService {

	public List<Admin> displayAll();
	public Admin addMovie(Admin movie);
	public String deleteMovie(int aid);
	public List<Admin> findByMovieType(String type);
	public List<Admin> findByMovieRating(int rating);
	public List<Admin> findByMovieActor(String actor1);
	
	
	
	
	
}
