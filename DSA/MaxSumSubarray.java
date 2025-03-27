package DSA;

public class MaxSumSubarray {
	public static int FindMaxSum(int[] arr,int start,int end) {
			int sum = 0;
			while(start<=end) {
				sum+=arr[start++];
			}
			return sum;
		}
		public static void main(String[] args) {
			int[] arr = {-2,1,-3,4,-1,2,1,-5,-4};
			int end = arr.length;
			int maxSum=0;
			int currentSum=0;
			for(int i=0;i<=end-1;i++) {
				for(int j=i;j<=end-1;j++) {
					currentSum=FindMaxSum(arr,i,j);
					if(currentSum>maxSum)
						maxSum = currentSum;
				}
			}
			System.out.println(maxSum);
		}
	}
