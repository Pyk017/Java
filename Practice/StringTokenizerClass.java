import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {
        
        StringTokenizer stringTokenizer = new StringTokenizer("new,tshirt,is,very,nice", ",", true);
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken("is"));
        }
        
        
        stringTokenizer = new StringTokenizer("My name is :- Prkhar Kumar Kashyap");
        while (stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextElement());
        }
    } 
}
