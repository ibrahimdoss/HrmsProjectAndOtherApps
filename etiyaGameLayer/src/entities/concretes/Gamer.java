package entities.concretes;

import java.time.LocalDate;

public class Gamer extends User {
	public Gamer (int id, String nationalIdentityNumber, String firstName, String lastName, LocalDate yearOfBirth, int gender) {
		super(id,nationalIdentityNumber,firstName,lastName,yearOfBirth,gender);
	}
}
