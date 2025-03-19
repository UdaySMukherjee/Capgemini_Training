package twodarray;

public class TransposeWithoutNewArray {
	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Original Matrix : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr[0].length;j++) {
				if(i!=j) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}	
			}
		}
		System.out.println("Transpose matrix is : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
}
