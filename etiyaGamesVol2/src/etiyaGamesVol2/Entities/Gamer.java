package etiyaGamesVol2.Entities;

import java.time.LocalDate;

public class Gamer extends User{
	
	public Gamer (int id, String nationalIdentityNumber, String firstName, String lastName, LocalDate yearOfBirth) {
		super(id,nationalIdentityNumber,firstName,lastName,yearOfBirth);
	}

}
