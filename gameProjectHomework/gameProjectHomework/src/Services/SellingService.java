package Services;

import Entities.Game;
import Entities.Gamer;
import Entities.Offer;

public class SellingService implements SellingServiceManager {

	@Override
	public void sellGame(Gamer gamer, Game game,Offer offer) {
		
		System.out.println(gamer.getFirstName()+" adlý oyuncu "+game.getGameName()+" adlý oyunu"+offer.getOfferName()+" ile satýn aldý. ");
		
		
		
	}

}
