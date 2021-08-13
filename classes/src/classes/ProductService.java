package classes;

public class ProductService {
	
	public void add(Product product) {
		System.out.println("Ürün Kaydedildi");
	}
	
	public Product[] getAllProducts() {
		//normalde databaseden çekilir.
		
		Product product1 =new Product();
		product1.productName="Rode Nt";
		product1.unitPrice=1200;
		product1.discountRate=10;
		product1.discountPrice=1080;
		product1.imagePath="http://images/p1.jpg";
		
		Product product2 =new Product();
		product2.productName="LG X-Boom";
		product2.unitPrice=1200;
		product2.discountRate=10;
		product2.discountPrice=1080;
		product2.imagePath="http://images/p1.jpg";
		
		Product product3 =new Product();
		product3.productName="Monster";
		product3.unitPrice=1200;
		product3.discountRate=10;
		product3.discountPrice=1080;
		product3.imagePath="http://images/p1.jpg";
		
		Product product4 =new Product();
		product4.productName="Dell";
		product4.unitPrice=1200;
		product4.discountRate=10;
		product4.discountPrice=1080;
		product4.imagePath="http://images/p1.jpg";
		
		Product product5 =new Product();
		product5.productName="Drone";
		product5.unitPrice=1200;
		product5.discountRate=10;
		product5.discountPrice=1080;
		product5.imagePath="http://images/p1.jpg";
		
		
		Product[] products= {product1,product2,product3,product4,product5};
		
		return products;
	}
}
