package Abstract;

import Entities.Customer;

public interface CustomerService {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
}
