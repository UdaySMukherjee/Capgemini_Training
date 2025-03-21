package objectorientedconcepts;

 class Driver {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.brand="Lenovo";
		l1.price=80000;
		l1.ram=16;
		Laptop l2 = new Laptop();
		if(l1 == l2) {
			System.out.print(true);
		}
		else {
			System.out.print(false);
		}
		System.out.println(l1.brand);
		System.out.println(l1.price);
		System.out.println(l1.ram);
	}
}
