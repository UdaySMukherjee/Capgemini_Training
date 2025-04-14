package Generics;

public class Box<T> {
	
	private T value;
	Box(T value){
		this.value=value;
		
	}
	T getValue() {
		return value;
	}

}
