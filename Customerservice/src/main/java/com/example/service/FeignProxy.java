package com.example.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.model.AdminDto;

@FeignClient(name="adminservice", url="http://localhost:8081/admins")
public interface FeignProxy {

	
	@GetMapping("/search/{type}")
	public List<AdminDto> findByMovieType(@PathVariable("type") String type);
	
	@GetMapping("/search/rating/{rating}")
	public List<AdminDto> findByMovieRating(@PathVariable("rating") int rating);
	
	@GetMapping("/search/actor/{actor1}")
	public List<AdminDto> findByMovieActor(@PathVariable("actor1") String actor1);
	
}
