package com.example.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class AdminDto {
	
	
	int aid;
	
	
	String name;
	
	
	String lang;
	
	
	int rating;
	
	
	String type;
	
	
	String actor1;
	
	
	String actor2;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getActor1() {
		return actor1;
	}

	public void setActor1(String actor1) {
		this.actor1 = actor1;
	}

	public String getActor2() {
		return actor2;
	}

	public void setActor2(String actor2) {
		this.actor2 = actor2;
	}

	public AdminDto(int aid, String name, String lang, int rating, String type, String actor1, String actor2) {
		super();
		this.aid = aid;
		this.name = name;
		this.lang = lang;
		this.rating = rating;
		this.type = type;
		this.actor1 = actor1;
		this.actor2 = actor2;
	}
	
	public AdminDto() {
		
	}

}
