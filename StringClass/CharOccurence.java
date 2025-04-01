package StringClass;

public class CharOccurence {
	public static void main(String[] args) {
		String str = "hgasrkbjjqW.LFSAL;MFB;gbs l 'j 538 y";
		char ch = 'a';
		int count = 0;
		for(int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i)==ch)
				count++;
		}
		System.out.print(count);
	}
}
