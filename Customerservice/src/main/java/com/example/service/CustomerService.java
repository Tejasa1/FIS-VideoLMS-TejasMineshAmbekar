package com.example.service;

import java.util.List;



import com.example.model.AdminDto;
import com.example.model.Customer;

public interface CustomerService {

	public List<Customer> displayAll();
	public List<AdminDto> findByMovieType(String type);	
	public List<AdminDto> findByMovieRating(int rating);
	public List<AdminDto> findByMovieActor(String actor1);
	
}
