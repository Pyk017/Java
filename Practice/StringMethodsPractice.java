class StringMethods {
    public void CharAtExample() {
        System.out.println("Example of CharAt method!");
        String name = "JavaScript";
        char character = name.charAt(3);
        System.out.println("The 4th character of JavaScript is:- " + character);
        System.out.println("The first character of JavaScript is:- " + name.charAt(0));
        System.out.println("The last character of JavaScript is:- " + name.charAt(name.length() - 1));

    }

    public void CompareToExample(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "meklo";
        String s4 = "hemlo";
        String s5 = "flag";
        String s6 = "";
        String s7 = "hellow";
        String s8 = "Aemlo";

        System.out.println(s1.compareTo(s2)); //? 0, as both strings are equal.
        System.out.println(s1.compareTo(s3)); //? -5, because 'h' is 5 times less than 'm'.
        System.out.println(s1.compareTo(s4)); //? -1, because 'l' is 1 times less than 'm'.
        System.out.println(s1.compareTo(s5)); //? 2, because 'h' is 2 times less than 'f'.
        System.out.println(s1.compareTo(s6)); //? 5, as the second string is empty, it returns the length of the first string (positive).
        System.out.println(s6.compareTo(s5)); //? -4, as the first string is empty, it returns the length of the second string (negative).
        System.out.println(s1.compareTo(s7)); //? -1, the length of second string is greater than first string by 1.
        System.out.println(s1.compareTo(s8));        
    }

    public void ConcatExample() {
        String s1 = "Hello";
        String s2 = "Secret";
        String s3 = "Society";

        String s4 = s1.concat(s2);
        System.out.println(s4); //? HelloSecret

        s4.concat(s3);
        System.out.println(s4); //? string s4 do not change, as it is immutable. you need to assign to a new String instance variable.
                                //? output will be : HelloSecret

        String s5 = s4.concat(" Java is ").concat("really fun to ").concat("Learn!");
        System.out.println(s5); //? HelloSecret Java is really fun to Learn!
    }

    public void ContainsExample() {
        String str = "My name is not the perfect one but the influencial one definelty.";

        boolean isContains = str.contains("perfect one");
        System.out.println(isContains); //? true

        System.out.println(str.contains("Influential one")); //? false

    }

    public void EndsWithExample() {
        String s1 = "java is tough to learn";
        System.out.println(s1.endsWith("n")); //? true
        System.out.println(s1.endsWith("lear")); //? false

        s1 = "https://pyk017.github.com";
        System.out.println(s1.endsWith(".com")); //? true

        System.out.println(s1.endsWith("")); //? true, empty string always return true
                                            //? "test" + "" = "test" 

        System.out.println(s1.endsWith(" ")); //? false
    }

    public void EqualsExample() {
        String s1 = "javascript";
        String s2 = "javascript";
        String s3 = "JAVASCRIPT";
        String s4 = "python";

        System.out.println(s1.equals(s2)); //? true, content and case is same
        System.out.println(s1.equals(s3)); //? false, case is not same
        System.out.println(s1.equals(s4)); //? false, content is not same
        System.out.println(s1.equalsIgnoreCase(s3)); //? true, ignoring case the content is same.
    }

    public void FormatExample() {
        String str = "javascript";
        String s1 = String.format("Name is %s.", str);
        String s2 = String.format("Value is %f.", 32.32245);
        String s3 = String.format("Value is:-%5.4f", 32.32245);
        String s4 = String.format("Value is :- %d", 101);
        String s5 = String.format("Value is :- %c", 'x');

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

    }

    public void GetBytesExample() {
        String s1 = "PRAKHAR kumar";

        byte[] barr = s1.getBytes();

        for (byte b: barr) {
            System.out.println(b);
        }

        String s2 = new String(barr);
        System.out.println(s2);
    }

    public void GetCharsExample() {
        String str = new String("Hi Dave, How are you ?");
        char[] ch = new char[10];
        try {
            str.getChars(6, 16, ch, 0);
            System.out.println(ch);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void IndexOfExample() {
        String str = "This is indexOf Example.";

        int ind = str.indexOf('i');

        System.out.println(ind);
        System.out.println(str.indexOf('i', 5));
        System.out.println(str.indexOf("indexOf"));
        System.out.println(str.indexOf("is", 4));
    }

    public void IsEmptyExample() {
        String s1 = "";
        String s2 = "javascript";

        System.out.println(s1.isEmpty()); //? true
        System.out.println(s2.isEmpty()); //? false

        //! String s3 = null;
        //! System.out.println(s3.isEmpty()); // Runtime Error, as s3 is null not a string.

        String s4 = "  ";
        System.out.println(s4.isBlank()); //? true
    }

    public void JoinExample() {
        String joinstring = String.join("-", "Prakhar", "is", "a", "Software", "Developer");
        System.out.println(joinstring);

        String[] ar = {"Prakhar", "is", "a", "Software", "Developer"};
        System.out.println(String.join("#", ar));
    }

    public void ReplaceExample() {
        String str = "I should be a good developer and a practice more.";
        String rep = str.replace('a', 'x');
        System.out.println(rep);

        rep = str.replace("a", "end");
        System.out.println(rep);
    }

    public void SplitExample() {
        String s1 = "java string method by examples.";

        String[] words = s1.split("\\s", 4);

        for (String word: words) {
            System.out.println(word);
        }
    }

    public void StartsWithExample() {
        String s1 = "JavaScript is the most conceptual language in the community.";

        System.out.println(s1.startsWith("JavaScript")); //? true
        System.out.println(s1.startsWith("Java")); //? true
        System.out.println(s1.startsWith("javascript")); //? false, as "j" and "J" are different.
        System.out.println(s1.startsWith("ava", 1)); //? true, it starts with index 1.
    }

    public void SubStringExmple() {
        String s = "javascript";

        System.out.println(s.substring(2, 5)); //? vas, inclusive begin index,  exclusive of end index.
        System.out.println(s.substring(3)); //? ascript, begin index.
    }

    public void ToCharArrayExample() {
        String s = "Java is King.";

        char[] ch = s.toCharArray();

        System.out.println(ch); //? Java is King.
        for (char c: ch) {
            System.out.println(c);
        }
    }

    public void ToUpperLowerCase() {
        String s1 = "JAVASCRIPT Is fUN!";
        
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
    }
}


public class StringMethodsPractice {
    public static void main(String[] args) {
        StringMethods stringMethods = new StringMethods();   
        stringMethods.ToUpperLowerCase();
    }   
}
