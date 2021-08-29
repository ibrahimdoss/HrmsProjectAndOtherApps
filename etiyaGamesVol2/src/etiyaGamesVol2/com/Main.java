package etiyaGamesVol2.com;

import java.time.LocalDate;

import etiyaGamesVol2.Entities.Game;
import etiyaGamesVol2.Entities.Gamer;
import etiyaGamesVol2.business.abstracts.GamePlayService;
import etiyaGamesVol2.business.abstracts.GamerService;
import etiyaGamesVol2.business.concretes.CalculatorGameManager;
import etiyaGamesVol2.business.concretes.GamePlayManager;
import etiyaGamesVol2.business.concretes.GamerManager;
import etiyaGamesVol2.core.MernisKpsServiceAdapter;

public class Main {

	public static void main(String[] args) {

		Gamer gamer1 = new Gamer(1,"1234567832124","Ýbrahim","Dos",LocalDate.of(1978, 6, 2));
		Gamer gamer2= new Gamer(2,"	2345768768673","Ali","Þimþek",LocalDate.of(2005, 3, 29));
		Gamer gamer3 = new Gamer(3,"1234598021321","Cemre","Yýldýz",LocalDate.of(1934, 8, 21));

		
		Game game1 = new Game(1,"Valorant","FPS",500,50);
		Game game2 = new Game(2,"CS-GO","FPS",500,70);
		Game game3 = new Game(3,"Call Of Duty","FPS",5000,90);


		GamerService gamerService = new GamerManager(new MernisKpsServiceAdapter());
		gamerService.add(gamer1);
		
		GamePlayService gamePlayService1  = new GamePlayManager(new CalculatorGameManager());
		GamePlayService gamePlayService2  = new GamePlayManager(new CalculatorGameManager());
		GamePlayService gamePlayService3  = new GamePlayManager(new CalculatorGameManager() );

		
		gamePlayService1.play(gamer1, game1);
		gamePlayService2.play(gamer2, game2);
		gamePlayService3.play(gamer3, game3);

		
	}

}
