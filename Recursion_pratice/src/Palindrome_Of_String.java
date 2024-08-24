//write a recursive java method that determines if a string s is a palindrome that it is 
//equals to its reverse for example appa reverse is appa so it's palindrome
public class Palindrome_Of_String {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) 
            return true;

        if (str.charAt(0) != str.charAt(str.length() - 1)) 
            return false;

        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        System.out.print(isPalindrome("abba"));
    }
}
