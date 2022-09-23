package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/admins")
@CrossOrigin("*")
public class AdminController {

	
	@Autowired
	AdminService service;
	
	@GetMapping("/all")
	public List<Admin> getAll(){
		return service.displayAll();
	}
	
	@PostMapping("/add")
	public Admin addAdminMovie(@RequestBody Admin movie) {
		return service.addMovie(movie);
	}
	
	@DeleteMapping("/delete/{aid}")
	public String deleteAdminMovie(@PathVariable("aid") int aid) {
		return service.deleteMovie(aid);
	}
	
	@GetMapping("/search/{type}")
	public List<Admin> findByType(@PathVariable("type") String type){
		return service.findByMovieType(type);
	}
	
	@GetMapping("/search/rating/{rating}")
	public List<Admin> findByRating(@PathVariable("rating") int rating){
		return service.findByMovieRating(rating);
	}
	
	@GetMapping("/search/actor/{actor1}")
	public List<Admin> findByActor1(@PathVariable("actor1") String actor1){
		return service.findByMovieActor(actor1);
	}
	
	
}
