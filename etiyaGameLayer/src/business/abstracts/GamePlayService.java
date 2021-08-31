package business.abstracts;

import entities.concretes.Gamer;

public interface GamePlayService {
	int calculateAge(Gamer gamer);
	boolean calculateGender(Gamer gamer);
}
