package Entities;

import java.time.LocalDate;

public class Gamer {
	private String firstName;
	private String lastName;
	private String nationalId;
	private String dateOfBirth;
	private int age;

	public Gamer() {
		super();
	}

	public Gamer(String firstName, String lastName, String nationalId, String dateOfBirth, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalId = nationalId;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
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

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Gamer [firstName=" + firstName + ", lastName=" + lastName + ", nationalId=" + nationalId
				+ ", dateOfBirth=" + dateOfBirth + ", age=" + age + "]";
	}

}
