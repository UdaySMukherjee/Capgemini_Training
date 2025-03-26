package Hierarchical;

public class DriverVehicle {
	public static void main(String[] args) {
		Car c = new Car("WB 26A 1001","Maruti","Omni Van",800,true,4);
		c.displayDetails();
		System.out.println();
		Bike b = new Bike("WB 26A 1509","Maruti","Splendor",500,true,true);
		b.displayDetails();
	}
}
