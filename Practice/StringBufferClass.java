class PerformanceTest {
    public static String concatWithString() {
        String str = "Java";
        for (int i=0; i<10000; i++) {
            str += " is fun.";
        }
        return str;
    }

    public static String concatWithStringBuffer() {
        StringBuffer sBuffer = new StringBuffer("Python");
        for (int i=0; i<10000; i++) {
            sBuffer.append(" is more fun");
        }
        return sBuffer.toString();
    }

    public static String concatWithStringBuilder() {
        StringBuilder builder = new StringBuilder("JavaScript");
        for (int i = 0; i <10000; i++) {
            builder.append(" is a more conceptual language.");
        } 
        return builder.toString();
    }

    public static void test() {
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time Taken by Concatinating with Strings :- " + (System.currentTimeMillis() - startTime) + "ms");
        
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time Taken by Concatinating with StringBuffer :- " + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        concatWithStringBuilder();
        System.out.println("Time Taken by Concatinating with StringBuilder :- " + (System.currentTimeMillis() - startTime) + "ms");
    }
}


class HashCodeTest {
    public static void test() {
        System.out.println("Hashcode test of String!");
        String str = "Java";
        System.out.println(str.hashCode());
        str += " is a perfect language to start.";
        System.out.println(str.hashCode());

        System.out.println("Hashcode test of StringBuffer!");
        StringBuffer sBuffer = new StringBuffer("Python");
        System.out.println(sBuffer.hashCode());
        sBuffer.append("is an interesting language to learn.");
        System.out.println(sBuffer.hashCode());

        System.out.println("Hashcode test of StringBuilder!");
        StringBuilder builder = new StringBuilder("JavaScript");
        System.out.println(builder.hashCode());
        builder.append("is an Conceptual language to learn.");
        System.out.println(builder.hashCode());
    }
}


public class StringBufferClass {
    public static void main(String[] args) {
        PerformanceTest.test();
        HashCodeTest.test();
        // String s = "Prakhar Kumar";
        // StringBuffer sBuffer = new StringBuffer(s);
        // StringBuffer sBuffer2 = new StringBuffer(s.substring(6));
        // sBuffer2.append(909);
        // System.out.println(sBuffer.reverse());
        // System.out.println(sBuffer2);
        
    }
}
