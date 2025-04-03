package DSA;

public class MissingNumber {
	public static int findMissing(int[] arr) {
		int total = arr.length;
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum+=arr[i];
		}
		int total_sum = (total*(total+1))/2;
		return total_sum-sum;
	}
	public static void main(String[] args) {
		int[] array = {9,6,4,2,3,5,7,0,1};
		System.out.print(findMissing(array));
	}
}
