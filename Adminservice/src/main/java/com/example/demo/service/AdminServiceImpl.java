package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;
import com.example.demo.repo.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminRepo repo;
	
	@Override
	public List<Admin> displayAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Admin addMovie(Admin movie) {
		// TODO Auto-generated method stub
		return repo.save(movie);
	}

	@Override
	public String deleteMovie(int aid) {
		// TODO Auto-generated method stub
		repo.deleteById(aid);
		return "Movie Deleted";
	}

	@Override
	public List<Admin> findByMovieType(String type) {
		// TODO Auto-generated method stub
		return repo.findByMovieType(type);
	}

	@Override
	public List<Admin> findByMovieRating(int rating) {
		// TODO Auto-generated method stub
		return repo.findByMovieRating(rating);
	}

	@Override
	public List<Admin> findByMovieActor(String actor1) {
		// TODO Auto-generated method stub
		return repo.findByMovieActor(actor1);
	}

}
