package string.variants;

public class Palindrome {

    public static boolean isPalindrome(String string) {

        string = string.toLowerCase();
        
        StringBuffer stringBuffer = new StringBuffer(string);

        return stringBuffer.toString().equals(stringBuffer.reverse().toString());
    }
    
}
