package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AdminDto;
import com.example.model.Customer;
import com.example.service.CustomerService;
//import com.example.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customers")
@CrossOrigin("*")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	
	@GetMapping("/all")
	public List<Customer> getAll(){
		return service.displayAll();
	}
	
	@GetMapping("/search/{type}")
	public List<AdminDto> getByMovieType(@PathVariable("type") String type){
		return service.findByMovieType(type);
	}
	
	@GetMapping("/search/rating/{rating}")
	public List<AdminDto> getByMovieRating(@PathVariable("rating") int rating){
		return service.findByMovieRating(rating);
	}
	
	@GetMapping("/search/actor/{actor1}")
	public List<AdminDto> getByMovieActor(@PathVariable("actor1") String actor1){
		return service.findByMovieActor(actor1);
	}
	
	
}
