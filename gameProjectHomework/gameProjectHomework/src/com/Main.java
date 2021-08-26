package com;

import Adapters.GamerCheckService;
import Entities.Game;
import Entities.Gamer;
import Entities.Offer;
import Services.GamerService;
import Services.SellingService;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer();
		gamer1.setFirstName(" Eren");
		gamer1.setLastName("Aydin");
		gamer1.setAge(22);
		gamer1.setDateOfBirth("1515144");
		gamer1.setNationalId("12345678910");
		//
		Gamer gamer2 = new Gamer("Ýbo","Gülay","12345","122345",15);
		
		Game game1 = new Game();
		game1.setGameName("PUBG");
		game1.setGamePrice(20);
		game1.setGameType("FPS");
		
		
		GamerService gamerService = new GamerService(new GamerCheckService());
		gamerService.add(gamer1);
		gamerService.add(gamer2);
		gamerService.getAllGames();
		
		Offer offer1 = new Offer();
		offer1.setOfferId(1);
		offer1.setOfferName(" Yil basi kampanyasi");
		offer1.setDiscountRate(30.0);
		
		SellingService selling = new SellingService();
		selling.sellGame(gamer1, game1, offer1);
		
	}

}
