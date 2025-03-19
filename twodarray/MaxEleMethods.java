package twodarray;

import java.util.Arrays;

public class MaxEleMethods {
	
	public static int maxelement(int[][] arr) {
		int max=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]>max)
					max = arr[i][j];
			}
		}return max;
	}
	
	public static int[] maxelementindex(int[][] arr) {
		int max=arr[0][0];
		int row_index=0;
		int col_index=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]>max)
					max = arr[i][j];
					row_index = i;
					col_index = j;
			}
		}
		int[] arr1 = {row_index,col_index};
		return arr1;
	}
	
	public static void main(String[] args) {
		int[][] arr = {{3,1,2},{4,9,5},{8,1,3}};
		
		System.out.println("maximum element is "+maxelement(arr));
		System.out.println("row & column"+Arrays.toString(maxelementindex(arr)));
	}
}
