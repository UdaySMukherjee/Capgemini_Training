package DSA;

public class PalindromeString {
	public static boolean CheckIfPalindrome(String s,int low,int high) {
		while(low<high) {
			if(s.charAt(low)!=s.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "abc";
		int end = str.length();
		int count=0;
		for(int i=0;i<end;i++) {
			for(int j=i;j<end;j++) {
				if(CheckIfPalindrome(str,i,j))
					count+=1;
			}
		}
		System.out.print(count);
	}
}
