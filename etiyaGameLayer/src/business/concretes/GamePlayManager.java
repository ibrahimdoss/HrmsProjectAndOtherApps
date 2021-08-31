package business.concretes;

import java.time.LocalDate;
import java.time.Period;

import business.abstracts.GamePlayService;
import entities.concretes.Gamer;

public class GamePlayManager implements GamePlayService {

	@Override
	public int calculateAge(Gamer gamer) {

		Period yasFarki = Period.between(gamer.getYearOfBirth(), LocalDate.now());
		
		if (yasFarki.getYears()>70) {
			return 1;
		}else if(yasFarki.getYears()>=18){
			return 2;
			
		}else {
			return 3;
		}
			
		
		
		
	}

	@Override
	public boolean calculateGender(Gamer gamer) {
		if (gamer.getGender()==1) {
			return true;
			
		}else {
			return false;

		}
	}

}
