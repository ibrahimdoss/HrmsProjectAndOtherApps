package entities.concretes;

import java.time.LocalDate;

public class User {
	private int id;
	private String nationalIdentityNumber;
	private String firstName;
	private String lastName;
	private LocalDate yearOfBirth;
	private int gender;
	
	public User() {
		super();
	}

	public User(int id, String nationalIdentityNumber, String firstName, String lastName, LocalDate yearOfBirth, int gender) {
		super();
		this.id = id;
		this.nationalIdentityNumber = nationalIdentityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.gender=gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalIdentityNumber() {
		return nationalIdentityNumber;
	}

	public void setNationalIdentityNumber(String nationalIdentityNumber) {
		this.nationalIdentityNumber = nationalIdentityNumber;
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

	public LocalDate getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(LocalDate yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}
	
}
