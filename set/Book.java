package set;

public class Book implements Comparable<Book> {
	private int id;
	private String title;
	private double price;
	
	Book(int id, String title, double price){
		this.id = id;
		this.title = title;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Book[ID: "+this.id+" Title: "+this.title+" Price: "+this.price+"]\n";
	}
	@Override
	public int compareTo(Book b){
		return this.id - b.id;
	}

	
}
