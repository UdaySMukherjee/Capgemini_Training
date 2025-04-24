package Demo;

public class PalindromeChecker {

    public boolean isPalindrome(String str,String reversed) {
        return str.equals(reversed);
    }

    public String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
