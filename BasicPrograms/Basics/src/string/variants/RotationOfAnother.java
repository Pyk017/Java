// Java Program to detemine whether one string is a rotation of another string.
// Example: string1 : abcde
//         string2: deabc

package string.variants;

public class RotationOfAnother {
    public static boolean checkRotation(String string) {
        String[] strings = string.split(" ");
        
        String str1 = strings[0];
        String str2 = strings[1];

        String temp = str1 + str1;

        return temp.contains(str2);

    }
}
