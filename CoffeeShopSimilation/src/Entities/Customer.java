package Entities;

import java.time.*;
public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationallityId;
	
	
	
	public Customer() {
		
	}



	public Customer(int id, String firstName, LocalDate dateOfBirth, String nationallityId, String lastName) {
		
		this.id = id;
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
		this.nationallityId = nationallityId;
		this.lastName=lastName;
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return lastName;
	}



	public void setlastName(String lastName) {
		this.lastName = lastName;
	}



	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public String getNationallityId() {
		return nationallityId;
	}



	public void setNationallityId(String nationallityId) {
		this.nationallityId = nationallityId;
	}
	
	
}
