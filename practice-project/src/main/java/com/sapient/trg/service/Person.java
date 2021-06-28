package com.sapient.trg.service;

import java.time.LocalDate;

//Plain old java object(POJO)
public class Person {
	private Integer personId;
	private String firstName;
	private String lastName;
	private LocalDate birthdate;
	private Long moblie;
	
	public Person() {
		
	}
	
	public Person(Integer personId, String firstName, String lastName, LocalDate birthdate, Long moblie) {
		super();
		
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.moblie = moblie;
		if(this.firstName == null && this.lastName==null) {
			throw new IllegalArgumentException("Both names should not be null");
		}
	}
	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}
	public Long getMoblie() {
		return moblie;
	}
	public void setMoblie(Long moblie) {
		this.moblie = moblie;
	}
	
}
