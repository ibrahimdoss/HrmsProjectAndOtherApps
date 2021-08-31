package business.abstracts;

import entities.concretes.Gamer;

public interface ScoreService {
	
	double calculateScore(Gamer gamer, double points);
}
