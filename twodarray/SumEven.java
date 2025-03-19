package twodarray;

public class SumEven {
	public static void main(String[] args) {
		
		
		int[][] arr  = {{3,1,2},{4,9,5},{8,1,3}};
		
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j = 0 ;j<arr[0].length;j++) {
				if(arr[i][j]%2==0)
					sum+=arr[i][j];
				
			}
		}System.out.println("sum of even elements is "+sum);
	}
}
