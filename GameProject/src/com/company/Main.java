package com.company;

import Abstract.BaseCampaignManager;
import Abstract.BaseCustomerManager;
import Abstract.BaseSellerManager;
import Adapters.EdevletServiceAdapter;
import Concreate.CampainingManager;
import Concreate.GamerCustomerManager;
import Concreate.SalesCustomerManager;
import Adapters.SellerServiceAdapters;
import Entities.Customer;
import Entities.Gamer;
import Entities.*;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		 BaseCustomerManager baseCustomerManager=new GamerCustomerManager(new EdevletServiceAdapter());
	        BaseCampaignManager baseCampaignManager=new CampainingManager(new SellerServiceAdapters());
	        BaseSellerManager baseSellerManager=new SalesCustomerManager(new SellerServiceAdapters());
	        Gamer gamer=new Gamer("12345698","ab@gmail.com","Alev","Bal",LocalDate.of(2000,5,8),"12365412365","queen");
	        Seller seller=new Seller("12365896","ek@gmail.com","can","yýlmaz",LocalDate.of(2000,10,30),"12365236545","5");
	        Games game1=new Games("Pubg",2230,30);
	        Games game2=new Games("CS",1230,10);
	        baseCustomerManager.add(gamer);
	        baseCustomerManager.delete(gamer);
	        baseCustomerManager.update(gamer);
	        baseSellerManager.sell(game1,gamer);
	        baseSellerManager.sell(game2,gamer);
	        baseCampaignManager.campaignAdd(game1,seller);
	        baseCampaignManager.campaignUpdate(game1,seller);
	        baseCampaignManager.campaignDelete(game1,seller);

	    }

}
