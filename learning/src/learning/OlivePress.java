package learning;

import java.util.List;

import learning.models.Olive;


public class OlivePress {
    
    public int getOil(List<Olive> olive) {

        int totalOil = 0;
        for (Olive o: olive) {
            System.out.println(o.getName());
            totalOil += o.crush();
        }
        return totalOil;
    }
}
