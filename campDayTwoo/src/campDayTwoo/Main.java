package campDayTwoo;

import campDayTwoo.Product;
import campDayTwoo.ProductManager;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setId(1); 
		product1.setCourseName("Yazýlým Geliþtirici Yetiþtirme Kampý(JAVA + REACT)"); 
		product1.setInstructor("Engin Demiroð");
		product1.setPrice("Ücretsiz");
		product1.setCourseProgram("1.Gün, 2.Gün, 3.GÜn, 4.Gün, 5.Gün");
		
		Product[] products = {product1};
		for (Product product : products) {
			System.out.println(product.courseName);
		}
		
		ProductManager productManager=new ProductManager();
		productManager.login(product1);

	}

}
