package classes;

public class CustomerService {

	
	public Customer[] getCustomer() {
		Customer customer= new Customer(); 
		customer.firstName="Ali";
		customer.lastName="Yýldýz"; 
		customer.yearOfBirth=1994;
		customer.email="Ali@gmail.com";
		  
		 Customer customer1= new Customer(); 
		 customer1.firstName="Büþra";
		 customer1.lastName="Yýldýrým"; 
		 customer1.yearOfBirth=1992;
		 customer1.email="büsra@gmail.com";
		  
		 Customer customer2= new Customer(); 
		 customer2.firstName="Can";
		 customer2.lastName="Þimþek"; 
		 customer2.yearOfBirth=1998;
		 customer2.email="can@gmail.com";
		 
		 Customer[] customers= {customer,customer1,customer2};
		  
		 return customers;
		
		
	}
}
