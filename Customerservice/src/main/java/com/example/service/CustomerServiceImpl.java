package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.AdminDto;
import com.example.model.Customer;
import com.example.repo.CustomerRepo;


@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepo repo;
	
	@Autowired
	FeignProxy proxy;
	
	
	@Override
	public List<Customer> displayAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


	@Override
	public List<AdminDto> findByMovieType(String type) {
		// TODO Auto-generated method stub
		return proxy.findByMovieType(type);
	}


	@Override
	public List<AdminDto> findByMovieRating(int rating) {
		// TODO Auto-generated method stub
		return proxy.findByMovieRating(rating);
	}


	@Override
	public List<AdminDto> findByMovieActor(String actor1) {
		// TODO Auto-generated method stub
		return proxy.findByMovieActor(actor1);
	}
	
	
	

}
