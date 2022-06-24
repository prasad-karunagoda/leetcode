package prasad.leetcode.p1436;

import java.util.HashSet;
import java.util.List;

public class DestinationCity {

    public String destCity(List<List<String>> paths) {
        HashSet<String> fromCities = new HashSet<>();
        HashSet<String> toCities = new HashSet<>();
        for (List<String> p : paths) {
            fromCities.add(p.get(0));
            toCities.add(p.get(1));
        }
        toCities.removeAll(fromCities);
        return toCities.iterator().next();
    }
}
