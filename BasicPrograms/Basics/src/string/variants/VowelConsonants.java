package string.variants;

public class VowelConsonants {

    public static String getCountOfVowel(String string){
        int count = 0;

        for (char character: string.toCharArray()) {
            if (character == 'a' || character == 'A'
                || character == 'e' || character == 'E'
                || character == 'i' || character == 'I'
                || character == 'o' || character == 'O'
                || character == 'u' || character == 'U') {
                    count += 1;
                }
        }

        return String.valueOf(count);
    }


    public static String getCountOfWhitespaces(String string) {
        int count = 0;

        for (char character: string.toCharArray()) {
            if (character == ' ') {
                count += 1;
            }
        }

        return String.valueOf(count);
    }


    public static String getCountOfConsonants(String string) {

        int vowel = Integer.parseInt(getCountOfVowel(string));
        int white = Integer.parseInt(getCountOfWhitespaces(string));

        int consonant = string.length() - (vowel + white);

        return String.valueOf(consonant);
    }
    
}
