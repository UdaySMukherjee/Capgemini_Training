package DSA;

import java.util.Arrays;

public class DuplicateBinary {
	public static int[]findIndex(int[] array, int target) {
		int start = 0;
		int end = array.length;
		int index = -1;
		while(start<end) {
			int mid = start-(start-end)/2;
			if(array[mid]==target) {
				start = mid;
				end = mid;
				while(start>0 && array[start-1]==target) {
					start--;
				}
				while(end<array.length && array[end+1]==target) {
					end++;
				}
				break;
			}else if(array[mid]>target) {
				end = mid -1;
			}else {
				start = mid+1;
			}
		}
		int[] result = {start,end};
		return result;
	}
	public static void main(String[] args) {
		int[] array = {5,7,7,8,8,10};
		int target = 8;
		int[] result = findIndex(array,target);
		System.out.print(Arrays.toString(result));
	}
}






