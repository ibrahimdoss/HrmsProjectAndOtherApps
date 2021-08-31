package business.concretes;

import business.abstracts.GamePlayService;
import business.abstracts.ScoreService;
import entities.concretes.Gamer;

public class WomenScoreCalculator implements ScoreService{
	
	
	GamePlayService gamePlayService= new GamePlayManager();
	
	
	@Override
	public double calculateScore(Gamer gamer, double points) {
		if (gamePlayService.calculateGender(gamer)!= false) {
			System.out.println("Cinsiyetiniz Uygun Deðil!");
			return 0;

		}else{
			System.out.println("Toplanan puan : " + points*0.70);
			return points * 0.70;
		}
	}
}
