package Aggregation;

public class House {
	private String colour;
	private Room room;
	
	House(String colour, Room room){
		this.colour = colour;
		this .room = room;
	}
	
	public String getColour() {
		return colour;
	}
	
	public Room getRoom() {
		return room;
	}
	
}
