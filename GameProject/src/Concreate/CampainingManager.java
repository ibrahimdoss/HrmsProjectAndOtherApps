package Concreate;

import Abstract.BaseCampaignManager;
import Adapters.SellerServiceAdapters;
import Entities.Customer;
import Entities.Games;

public class CampainingManager extends BaseCampaignManager{
	SellerServiceAdapters sellerServiceAdapters;

	public CampainingManager(SellerServiceAdapters sellerServiceAdapters) {
		
		this.sellerServiceAdapters = sellerServiceAdapters;
	}
	
	 @Override
	    public void campaignAdd(Games games, Customer customer) {
	        super.campaignAdd(games, customer);
	    }

	    @Override
	    public void campaignUpdate(Games games, Customer customer) {
	        games.setPrice((int)this.sellerServiceAdapters.discountedPrice(games));
	        super.campaignUpdate(games, customer);
	    }

	    @Override
	    public void campaignDelete(Games games, Customer customer) {
	        super.campaignDelete(games, customer);
	    }
}
