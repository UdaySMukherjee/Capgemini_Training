package ComparatorInterface;

import java.util.Arrays;

public class ProductDriver {
	public static void main(String[] args) {
		Product p1 = new Product(1,"Shoe",999);
		Product p2 = new Product(5,"Mobile",67000);
		Product p3 = new Product(7,"Laptop",89000);
		Product p4 = new Product(3,"Book",333);
		Product[] products = {p1,p2,p3,p4};
		
		SortById s = new SortById();
		Arrays.sort(products,s);
		for (Product product : products) {
			System.out.println(product);
		}
	}
}
