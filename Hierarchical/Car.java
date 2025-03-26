package Hierarchical;

public class Car extends Vehicle{
	
	private int numberOfDoors;
	
	Car(String vehicleNumber,String brand,String model,double rentalPricePerDay,boolean isAvailable, int numberOfDoors){
		super(vehicleNumber,brand,model,rentalPricePerDay,isAvailable);
		this.numberOfDoors = numberOfDoors;
	}
	
	void displayDetails() {
		super.DisplayDetails();
		System.out.println("Number of Doors are : "+this.numberOfDoors);
	}

}
