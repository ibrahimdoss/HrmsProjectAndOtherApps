package classes;

public class Main {

	public static void main(String[] args) {
		
		String[] products= {"P1","P2","P3","P4","P5","P6","P7"};
		
		for(String product: products) {
			System.out.println(product);
		}
		
		ProductService productService=new ProductService();
		
		Product[] result = productService.getAllProducts();
		
		for(Product product : result) {
			System.out.println(product.productName);
			System.out.println(product.unitPrice);
			System.out.println(product.discountPrice);
			System.out.println("----------------");
		}
		
		
		CustomerService customerService=new CustomerService();
		
		Customer[] results = customerService.getCustomer();
		
		 for(Customer customloop:results) {
			 System.out.println(customloop.firstName);
			 System.out.println(customloop.lastName);
			 System.out.println(customloop.yearOfBirth);
			 System.out.println(customloop.email); System.out.println("-------------"); }
			 
		
		
		
	}

}
