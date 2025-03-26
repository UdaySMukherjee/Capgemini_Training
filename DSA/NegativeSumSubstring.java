package DSA;

public class NegativeSumSubstring {

	public static boolean CheckNegativeSum(int[] arr,int start,int end) {
		int sum = 0;
		while(start<=end) {
			sum+=arr[start++];
		}
		if(sum<0) {
//			System.out.println(sum);
			return true;
			}
		else
			return false;
		
	}
	public static void main(String[] args) {
		int[] arr = {-1,2,-3,4,-5};
		int end = arr.length;
		int count=0;
		for(int i=0;i<=end-1;i++) {
			for(int j=i;j<=end-1;j++) {
				if(CheckNegativeSum(arr,i,j))
					count+=1;
			}
		}
		System.out.println(count);
	}
}
