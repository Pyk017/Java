package string.variants;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MaxMinCharacter {

    public static String findMaxMinChar(String string) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (char character: string.toCharArray()) {
            

            if (character == ' ') {
                continue;
            }

            if (map.get(character) == null) {

                map.put(character, 1);

            } else {

                map.put(character, map.get(character) + 1);

            }
        }

        
        char greater = ' ', smaller = ' ';
        int great = -1, small = 999;

        for (Map.Entry<Character, Integer> mapElement: map.entrySet()) {
            if ((int)mapElement.getValue() > great) {
                great = (int)mapElement.getValue();
                greater = (char)mapElement.getKey();
            }

            if ((int)mapElement.getValue() < small) {
                small = (int)mapElement.getValue();
                smaller = (char)mapElement.getKey();
            }

        }

        System.out.println("Created Map is :- " + map);
        return "Greater Character :- " + greater + "\nSmaller Character :- " + smaller + "\n";
    }

    public static void printMap(Map<Character, Integer> map) {
        Iterator<Entry<Character, Integer>> iter = map.entrySet().iterator();

        System.out.println("Map is :- ");

        while (iter.hasNext()) {
            Map.Entry<Character, Integer> mapElements = (Map.Entry<Character, Integer>)iter.next();
            System.out.println(mapElements.getKey() + " " + mapElements.getValue());
        }
    }
}
