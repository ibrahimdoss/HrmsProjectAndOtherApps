package etiyaGamesVol2.business.concretes;

import etiyaGamesVol2.Entities.Game;
import etiyaGamesVol2.Entities.Gamer;
import etiyaGamesVol2.business.abstracts.BaseCalculatorGameService;
import etiyaGamesVol2.business.abstracts.GamePlayService;

public class GamePlayManager implements GamePlayService {

	BaseCalculatorGameService baseCalculatorGameService;
	
	
	public GamePlayManager(BaseCalculatorGameService baseCalculatorGameService) {
		super();
		this.baseCalculatorGameService = baseCalculatorGameService;
	}


	@Override
	public void play(Gamer gamer, Game game) {
		this.baseCalculatorGameService.calculator(gamer,game);

	}

}
