package Generics;

public class GenericMethod {
	public<T> void printArray(T[] arr) {
		for(T i: arr) {
			System.out.println(i+"\t");
		}
		
	}
    public static void main(String[] args) {
		Double[] arr= {1.3,2.5,3.7,4.9,5.1};
		new GenericMethod().printArray(arr);
	}
}
