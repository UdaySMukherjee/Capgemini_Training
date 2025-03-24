package ManyToOne;

public class ProductDriver {
	public static void main(String[] args) {
		Product product = new Product("Mobile");
		Review r1 = new Review("Average",product);
		Review r2 = new Review("Good",product);
		r1.display();
		r2.display();
	}

}
