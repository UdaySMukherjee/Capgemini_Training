package twodarray;

public class MaxElement {
	public static void main(String[] args) {
		int[][] arr = {{3,1,2},{4,9,5},{8,1,3}};
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
		System.out.println(max);
		System.out.println("row "+row_index+" & column"+col_index);
	}
}
