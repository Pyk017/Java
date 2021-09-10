package string.variants;

public class SwapCases {
    public static String swapCases(String string) {
        StringBuffer sBuffer = new StringBuffer();

        char newChar;
        
        for (char character: string.toCharArray()) {
            
            if (character >= 'a' && character <= 'z') {
            
                newChar = (char) ((char) character - 32);

            } else if (character >= 'A' && character <= 'Z') {
                
                newChar = (char) ((char) character + 32);

            } else {
                
                newChar = character;

            }

            sBuffer.append(newChar);
        }
    
        return sBuffer.toString();
    }
}
