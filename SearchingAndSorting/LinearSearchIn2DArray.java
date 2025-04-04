package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchIn2DArray {

	public static String LinearSearchAlgo(int[][] arr, int element) {
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[0].length;j++) {
				if(arr[i][j]==element) {
					int[] index = {i,j};
					return Arrays.toString(index);
				}
			}
		}
		return "-1";
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter row: ");
			int row = sc.nextInt();
			System.out.print("Enter col: ");
			int col = sc.nextInt();
			int[][] array = new int[row][col];
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print("Enter element: ");
					array[i][j] = sc.nextInt();
				}
			}
			System.out.print("Enter the key: ");
			int element = sc.nextInt();
			String index = LinearSearchAlgo(array,element);
			if(index!= "-1")
				System.out.println("Element found at Index: "+index);
			else
				System.out.println("Element not found");
		}
	}
}
