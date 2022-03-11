package prasad.leetcode.p1276;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberOfBurgersWithNoWaste {

    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        // jumboBurgers + smallBurgers = cheeseSlices   ---------------- Eq1
        // (jumboBurgers * 4) + (smallBurgers * 2) = tomatoSlices   ---- Eq2
        // Eq2 - 2 * Eq1 =>
        // jumboBurgers * 2 = tomatoSlices - 2 * cheeseSlices

        int twiceTheJumboBurgers = tomatoSlices - (2 * cheeseSlices);
        if (twiceTheJumboBurgers < 0 ||
                twiceTheJumboBurgers % 2 == 1 ||
                cheeseSlices - (twiceTheJumboBurgers / 2) < 0) {

            return Collections.emptyList();
        }
        else {
            int jumboBurgers = twiceTheJumboBurgers / 2;
            return Arrays.asList(jumboBurgers, cheeseSlices - jumboBurgers);
        }
    }
}
