package Composition;

public class RoomDriver {
	public static void main(String[] args) {
		House house = new House("Blue", 600);

		System.out.println(house.getColour());
		System.out.println(house.getRoom().getArea());
		
		house = null;
		System.out.println(house.getColour());
		System.out.println(house.getRoom().getArea());
	}

}