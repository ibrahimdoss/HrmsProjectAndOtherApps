package Concreate;

import Abstract.BaseSellerManager;
import Adapters.SellerServiceAdapters;
import Entities.Customer;
import Entities.Games;

public class SalesCustomerManager extends BaseSellerManager {
	SellerServiceAdapters sellerServiceAdapters;
	

	public SalesCustomerManager(SellerServiceAdapters sellerServiceAdapters) {
		this.sellerServiceAdapters = sellerServiceAdapters;
	}
	
	@Override
    public void sell(Games games, Customer customer) {
        games.setPrice((int)this.sellerServiceAdapters.discountedPrice(games));
        super.sell(games, customer);
    }
}
