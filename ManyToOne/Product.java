package ManyToOne;

public class Product {
	private String Product_name;
	
	public String getProduct() {
		return Product_name;
	}
	
	public void setProduct(String product_name) {
		this.Product_name = product_name;
	}
	Product(String product_name){
		this.Product_name = product_name;
	}

}
