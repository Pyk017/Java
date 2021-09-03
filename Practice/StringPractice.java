import java.util.Arrays;

class Stringing {

    public boolean Equals(String s1, String s2) {
        return (s1.equals(s2)) ? true: s1.equalsIgnoreCase(s2);
    } 

    public boolean EqualOperator(String s1, String s2) {
        return s1 == s2;
    }

    public int CompareTo(String s1, String s2) {
        return s1.compareTo(s2); 
    }

    public String concatenationByPlus(String s1, String s2) {

        String result = s1 + s2;
        // how compiler sees the above line as :=
        // String result = (new StringBuilder()).append(s1).append(s2).toString();
        return result;
    }

    public String concatenationByConcat(String s1, String s2) {
        return s1.concat(s2);
    }

    public String FormatConcat(String s1, String s2) {
        return String.format("%s => %s", s1, s2).toString();
    }

    public String JoinConcat(String s1, String s2) {
        return String.join(": ", s1, s2);
    }

    public String SubString(String s, int startIndex, int endIndex) {
        return s.substring(startIndex, endIndex);
    }

    public String[] Split(String s, String delimiter) {
        return s.split(delimiter);
    }


}

public class StringPractice {
    public static void main(String[] args) {
        System.out.println("STring practice starts here!");

        Stringing strObj = new Stringing();

        String s1 = "Sachin";
        String s2 = "Tendulkar";
        
        // System.out.println(strObj.concatenationByPlus(s1, s2));
        // System.out.println(strObj.concatenationByConcat(s1, s2));
        // System.out.println(strObj.FormatConcat(s1, s2));
        // System.out.println(strObj.JoinConcat(s1, s2));


        System.out.println(strObj.SubString("Prakhar Kumar", 6, 11));
        String[] ar = strObj.Split(s1.concat(" " + s2), " ");
        System.out.println(Arrays.toString(ar));

        
    }
}
