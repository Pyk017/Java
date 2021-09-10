package string.variants;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String string) {
        String[] ar = string.split(" ");
        String string1 = ar[0].toLowerCase();
        String string2 = ar[1].toLowerCase();

        if (string1.length() != string2.length()) {
            return false;
        } else {

            char[] str1 = string1.toCharArray();
            char[] str2 = string2.toCharArray();

            Arrays.sort(str1);
            Arrays.sort(str2);
            
            return Arrays.equals(str1, str2);
        }
    }
}
