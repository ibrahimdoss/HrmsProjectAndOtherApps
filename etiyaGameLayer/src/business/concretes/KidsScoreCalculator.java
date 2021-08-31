package business.concretes;

import business.abstracts.GamePlayService;
import business.abstracts.ScoreService;
import entities.concretes.Gamer;

public class KidsScoreCalculator implements ScoreService{

	
	GamePlayService gamePlayService= new GamePlayManager();
	
	
	
	@Override
	public double calculateScore(Gamer gamer, double points) {
		if (gamePlayService.calculateAge(gamer)!=2) {
			System.out.println(gamer.getFirstName()+ " Adlý oyuncu yaþýnýz küçük!");
			return 0;

		}else{
			System.out.println(gamer.getFirstName()+ " Adlý Oyuncu" + "Toplanan puan : " + points);
			return points;
		}
	}
	
	
}
