package Lambda;

public class Uber {
	public static void main(String[] args) {
		Vehicle car =()->System.out.println("Car is starting");
		Vehicle bike =()->System.out.println("Bike is starting");
		car.start();
	}
}
