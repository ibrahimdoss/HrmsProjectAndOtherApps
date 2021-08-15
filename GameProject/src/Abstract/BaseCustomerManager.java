package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void add(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kaydýnýz  baþarýlý bir þekilde tamamlanmýþtýr.");

		
	}

	@Override
	public void update(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" bilgileriniz baþarýlý bir þekilde güncellenmiþtir.");

		
	}

	@Override
	public void delete(Customer customer) {
        System.out.println(customer.getFirstName()+" "+customer.getLastName()+" kaydýnýz  baþarýlý bir þekilde silinmiþtir.");

		
	}

}
