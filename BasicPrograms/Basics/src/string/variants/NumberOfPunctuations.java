package string.variants;

public class NumberOfPunctuations {
    
    public static String countOfPunctuations(String string) {
        int count = 0;

        for (char character: string.toCharArray()) {
            if (character == '!' 
                || character == ','
                || character == ';'
                || character == '.'
                || character == '?'
                || character == '\\'
                || character == ':') {
                    count += 1;
                }
        }

        return String.valueOf(count);
    }

}
