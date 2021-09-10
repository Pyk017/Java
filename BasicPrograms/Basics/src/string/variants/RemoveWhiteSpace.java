package string.variants;

public class RemoveWhiteSpace {
    
    public static String removeWhitespace(String string) {
        StringBuffer sBuffer = new StringBuffer();
        
        for (char character: string.toCharArray()) {
            if (character != ' ') {
                sBuffer.append(character);
            }
        }
        return sBuffer.toString();
    }

    public static String removeWhitespaceUsingReplace(String string) {
        String result = string.replace(" ", "");
        return result;
    }

}
