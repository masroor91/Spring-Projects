package com.mas.model;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	
	
	@NotEmpty(message="Name cant be left blank")
	private String name;
	
	@NotNull
	@Size(min=2, max=30)
	private String hobby;
	
	@NotNull
	private Long mobile;
	private List<String> skillSet;
	
	@NotNull(message="DOB is required")
	
	private Date dob;
	
	@Valid
	private Address address;

	public Address getAddress() {
		return address;
	}

	//SpringMVC will perform auto databinding task to bind the data of address into Address Object
	public void setAddress(Address address) {  
		this.address = address;
	}

	@Required
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getMobile() {
		return mobile;
	}

	@Required
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
