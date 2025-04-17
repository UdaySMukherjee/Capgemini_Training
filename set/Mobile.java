package set;

public class Mobile implements Comparable<Mobile> {
	String brand;
	double price;
	
	Mobile(String brand,double price){
		this.brand=brand;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return "Mobile[Brand: "+this.brand+" Price: "+this.price+"]";
	}

	@Override
	public int compareTo(Mobile m) {
		return this.brand.compareTo(m.brand);
	}
}
