package Abstract;

import Entities.Customer;
import Entities.Games;

public interface SellerService {
	void sell(Games games, Customer customer);
}
