package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	int cid;
	
	@Column
	String name;
	
	@Column
	int cno;
	
	@Column
	String address;
	
	@Column
	String date;
	
	@Column
	int age;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Customer(int cid, String name, int cno, String address, String date, int age) {
		super();
		this.cid = cid;
		this.name = name;
		this.cno = cno;
		this.address = address;
		this.date = date;
		this.age = age;
	}
	
	public Customer() {
		
	}
	
}
