import java.util.*;

public class PracticeArrayList {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();

        list.add("Prakhar");
        list.add("Kumar");
        list.add("Kashyap");
        list.add("Awesome");

        System.out.println(list);

        list.remove(2);
        System.out.println(list);

        String name = list.get(0);
        System.out.println(name);

        int pos = list.indexOf("awesome");
        System.out.println(pos);

    }
    
}
