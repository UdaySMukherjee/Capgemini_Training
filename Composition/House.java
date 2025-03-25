package Composition;

public class House {
	private String colour;
	private Room room;
	
	House(String colour, double area){
		this.colour = colour;
		room = new Room(area);
	}
	
	public String getColour() {
		return colour;
	}
	
	public Room getRoom() {
		return room;
	}
	
}
