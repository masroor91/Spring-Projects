package com.mas.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
	
	@NotNull
	private String name;
	
	@NotNull
	@Size(min=2, max=30)
	private String hobby;
	
	@NotNull
	private Long mobile;
	private List<String> skillSet;
	
	@NotNull
	private Date dob;
	
	private Address address;

	public Address getAddress() {
		return address;
	}

	//SpringMVC will perform auto databinding task to bind the data of address into Address Object
	public void setAddress(Address address) {  
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public List<String> getSkillSet() {
		return skillSet;
	}

	public void setSkillSet(List<String> skillSet) {
		this.skillSet = skillSet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
