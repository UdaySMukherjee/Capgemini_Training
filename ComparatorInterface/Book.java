package ComparatorInterface;

public class Book{
	int id;
	String name;
	double price;
	
	Book(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ID:\t"+id+"\tName of Book:\t"+name+"\tPrice:\t"+price;
	}
	
}
