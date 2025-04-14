package Generics;

public class Shape<K extends Number, V>{
	private K key;
	private V value;
	Shape(K key, V value){
		this.key=key;
		this.value=value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}
