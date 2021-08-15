package Entities;

import java.time.LocalDate;

public class Seller extends Customer {
	private String Number;
	
	public Seller(String id, String email, String firstName, String lastName, LocalDate dateOfBirth,
			String nationalityId, String Number) {
		super(id, email, firstName, lastName, dateOfBirth, nationalityId);
		this.Number=Number;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

}
