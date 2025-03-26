package Hierarchical;

public class Bike extends Vehicle{
	private boolean hasGear;
	
	Bike(String vehicleNumber,String brand,String model,double rentalPricePerDay,boolean isAvailable, boolean hasGear){
		super(vehicleNumber,brand,model,rentalPricePerDay,isAvailable);
		this.hasGear = hasGear;
	}
	
	void displayDetails() {
		super.DisplayDetails();
		System.out.println("Gear : "+this.hasGear);
	}
}
