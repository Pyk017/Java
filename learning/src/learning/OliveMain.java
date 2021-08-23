package learning;

import java.util.ArrayList;
import java.util.List;
import learning.models.Olive;

public class OliveMain {
    public static void main(String args[]) {

        List<Olive> olive = new ArrayList<>();

        Olive o1 = new Olive("Kalamata", 0x2E0854, 3);
        olive.add(o1);

        Olive o2 = new Olive("Algenian", 0x2E0854, 4);
        olive.add(o2);

        Olive o3 = new Olive("Ligurian", 0x000000, 5);
        olive.add(o3);

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olive); 
        System.out.println(totalOil);


    }
}