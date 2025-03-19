package twodarray;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
		System.out.print("Enter no. of rows: ");
		int row = sc.nextInt();
		System.out.print("Enter no. of cols: ");
		int col = sc.nextInt();
		int[][] arr  = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j = 0 ;j<col;j++) {
				System.out.print("Enter value arr["+i+"]["+j+"]: ");
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j = 0 ;j<col;j++) {
				System.out.print(arr[i][j]+" ");
				
			}System.out.println();
		}
		
	}
}
