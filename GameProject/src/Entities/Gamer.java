package Entities;

import java.time.LocalDate;

public class Gamer extends Customer {
	private String userName;

	public Gamer(String id, String email, String firstName, String lastName, LocalDate dateOfBirth,
			String nationalityId, String userName) {
		super(id, email, firstName, lastName, dateOfBirth, nationalityId);
		this.userName=userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
