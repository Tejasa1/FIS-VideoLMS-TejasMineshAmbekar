package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Admin;


@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{
	
	@Query("select m from Admin m  where m.type=?1")
	public List<Admin> findByMovieType(String type);
	
	
	@Query("select m from Admin m  where m.rating=?1")
	public List<Admin> findByMovieRating(int rating);
	
	@Query("select m from Admin m  where m.actor1=?1")
	public List<Admin> findByMovieActor(String actor1);

}
