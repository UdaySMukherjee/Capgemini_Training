package twodarray;

public class Transpose {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr1 = new int[arr[0].length][arr.length];
		System.out.println("Original Matrix : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr1[i][j] = arr[j][i];
			}
		}
		System.out.println("Transpose matrix is : ");
		for(int i=0;i<arr[0].length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr1[i][j]+" ");
			}System.out.println();
		}
	}
}
