package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.AdminDto;
import com.example.model.Customer;


@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

//	@Query("select m from Admin m  where m.type=?1")
//	public List<AdminDto> findByMovieType(String type);
	
//	@Query("select m from Admin m  where m.rating=?1")
//	public List<AdminDto> findByMovieRating(int rating);
//	
//	@Query("select m from Admin m  where m.actor1=?1")
//	public List<AdminDto> findByMovieActor(String actor1);
}
