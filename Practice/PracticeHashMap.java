import java.util.*;

public class PracticeHashMap {
    public static void main(String args[]){
        
        Map<String, Integer> map = new HashMap<>();

        map.put("Prkahar", 101);
        map.put("Kumar", 102);
        map.put("Kashyap", 103);
        map.put("Awesome", 104);

        System.out.println(map);

        int id = map.get("Kashyap");
        System.out.println(id);

        map.remove("Awesome");
        System.out.println(map);

    }
    
}
