package org.rishabh.springmvc.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

public class Student {
	
	@Size(max=10,min=3)
	private String name;
	private int id;
	private String password;
	private Date date;
	private List<String> subjects;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
