package Hierarchical;

public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	
	public void DisplayDetails() {
		System.out.println("Vehicle Number : "+this.vehicleNumber);
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+this.model);
		System.out.println("Rental Price per Day : "+this.rentalPricePerDay);
		System.out.println("Availablity : "+this.isAvailable);
	}
	
	public boolean rentVehicle() {
		return this.isAvailable;
	}
	
	Vehicle(String vehicleNumber,String brand,String model,double rentalPricePerDay,boolean isAvailable){
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.rentalPricePerDay = rentalPricePerDay;
		this.isAvailable = isAvailable;
		this.model = model;
	}
	
	Vehicle(){}
}
