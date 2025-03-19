package twodarray;

public class FindSumofRowandCol {
	public static void main(String[] args) {
		int[][] arr = {{6,4,5},{1,8,4},{7,2,6}};
		
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[0].length;j++) {
				sum+=arr[i][j];
			}System.out.println("Sum of +"+ i +"th row is : "+sum);
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[0].length;j++) {
				sum+=arr[j][i];
			}System.out.println("Sum of +"+ i +"th col is : "+sum);
		}
	}
}
