package string.variants;

public class Subsets {

    public static boolean printSubsets(String string) {
        int len = string.length();

        int temp = 0;


        try {
            
            String[] arr = new String[len * (len + 1) / 2];
    
    
            for (int i=0; i<len; i++) {
                for (int j=i; j<len; j++) {
                    arr[temp] = string.substring(i, j + 1);
                    temp += 1;
                }
            }
    
            System.out.println("All subsets of the String are :- ");
            for (String str: arr) {
                System.out.println(str);
            }

        } catch (Exception e) {

            System.out.println("Some Error Occured!");
            return false;

        }

        return true;
    }

    
    
}
