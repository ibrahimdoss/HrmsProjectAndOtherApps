package com;

import java.time.LocalDate;

import business.abstracts.ScoreService;
import business.concretes.KidsScoreCalculator;
import business.concretes.ManScoreCalculator;
import business.concretes.OldsScoreCalculator;
import business.concretes.WomenScoreCalculator;
import entities.concretes.Game;
import entities.concretes.Gamer;



public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1,"1234567832124","Ýbrahim","Dos",LocalDate.of(1978, 6, 2),1);
		Gamer gamer2= new Gamer(2,"	2345768768673","Ali","Þimþek",LocalDate.of(2005, 3, 29),1 );
		Gamer gamer3 = new Gamer(3,"1234598021321","Cemre","Yýldýz",LocalDate.of(1934, 8, 21),2);

		
		Game game1 = new Game(1,"Valorant","FPS",500,50);
		Game game2 = new Game(2,"CS-GO","FPS",500,70);
		Game game3 = new Game(3,"Call Of Duty","FPS",5000,90);

		
		ScoreService scoreService = new ManScoreCalculator();
		scoreService.calculateScore(gamer1, 100);
		ScoreService scoreService1 = new KidsScoreCalculator();
		scoreService1.calculateScore(gamer2, 100);
		ScoreService scoreService2 = new OldsScoreCalculator();
		scoreService2.calculateScore(gamer3, 100);

	}

}
