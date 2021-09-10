package string.variants;

public class NParts {
    public static boolean nParts(String string, int n) {
        try {
            int len = string.length();
            int ch = len / n;
            int temp = 0;

            String[] equalStrings = new String[n];

            if (len % n != 0) {
                System.out.println("String cann't be divided into equal parts");
                return false;
            }
            
            int i = 0;

            while (i < len) {
                equalStrings[temp] = string.substring(i, i + ch);
                temp += 1;
                i += ch;
            }

            for (String s: equalStrings) {
                System.out.println(s);
            }

        } catch (Exception e) {
            System.out.println("Some Error Occured !");
            return false;
        }
        return true;
    }
}
