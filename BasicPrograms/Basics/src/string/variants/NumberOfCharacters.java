package string.variants;

public class NumberOfCharacters {
    public static String countOfCharacters(String string) {
        
        int count = 0;

        for (char str: string.toCharArray()) {
            if (str != ' ') {
                count += 1;
            }
        }

        return String.valueOf(count);
    }
}
