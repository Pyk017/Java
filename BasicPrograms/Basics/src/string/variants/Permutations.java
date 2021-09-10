package string.variants;

public class Permutations {


    public static String swapString(String str, int i, int j) {
        char[] chArr = str.toCharArray();

        char ch;

        ch = chArr[i];
        chArr[i] = chArr[j];
        chArr[j] = ch;

        return String.valueOf(chArr);

    }

    public static void generatePermutations(String str, int start, int end) {
        if (start == end - 1) {
            
            System.out.println(str);

        } else {

            for (int i = start; i < end; i++) {
                str = swapString(str, start, i);
                generatePermutations(str, start + 1, end);
                str = swapString(str, start, i);
            }

        }
    }


    public static boolean printPermutations(String string) {

        int len = string.length();
        System.out.println("All Permutations of the String are :- ");
        try {
            generatePermutations(string, 0, len);

        } catch (Exception e) {
            System.out.println("Some Error Occured!");
            return false;
        }
        return true;
    }
    
}
