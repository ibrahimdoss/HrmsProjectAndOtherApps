package Services;

import Entities.Game;
import Entities.Gamer;
import Entities.Offer;

public interface SellingServiceManager {
	
	void sellGame(Gamer gamer,Game game,Offer offer );

}
