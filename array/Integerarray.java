package array;

import java.util.Scanner;

public class Integerarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[5];
		System.out.print("Enter element ");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextDouble();
		}
		for(int i =arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	}
	
}
