package ComparatorInterface;

public class Product {
	int id;
	String name;
	double price;
	
	public Product(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	@Override
	public String toString() {
		return "ID\t:"+id+"\tName\t:"+name+"\tPrice\t:"+price;
	}

}
