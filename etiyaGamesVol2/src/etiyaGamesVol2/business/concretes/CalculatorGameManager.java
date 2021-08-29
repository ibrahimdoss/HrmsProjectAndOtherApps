package etiyaGamesVol2.business.concretes;

import java.time.LocalDate;
import java.time.Period;

import etiyaGamesVol2.Entities.Game;
import etiyaGamesVol2.Entities.Gamer;
import etiyaGamesVol2.business.abstracts.BaseCalculatorGameService;

public class CalculatorGameManager implements BaseCalculatorGameService {

	@Override
	public void calculator(Gamer gamer, Game game) {
		
		Period yasFarki = Period.between(gamer.getYearOfBirth(), LocalDate.now());
		
		if (yasFarki.getYears()>70) {
			System.out.println(gamer.getFirstName() +" adlý oyuncu yaþlýdýr. "+ game.getGameName() +" taban puanýn "
					+ "%90'ýný alýr. Oyun puaný = "+game.getGamePoint() +" , Puanýnýnýz = "+ game.getGamePoint()*0.9);
			
		}else if(yasFarki.getYears()>=18){
			System.out.println(gamer.getFirstName() +" oyuncusu yetiþkindir. "
					+ game.getGameName() + " taban puanýn %70'ini alir. Oyun puaný = " +game.getGamePoint() +" , Puanýnýnz = "+ game.getGamePoint()*0.7);
			
		}else if (yasFarki.getYears()<18) {
			System.out.println(gamer.getFirstName() +" adlý oyuncu çocuktur. "+ game.getGameName() +" taban puanýn "
					+ "tamamýný alýr. Oyun puaný = "+game.getGamePoint() +" , Puanýnýz = "+ game.getGamePoint());
		}
		
		
		
		
		
		
		
		
	}

}
