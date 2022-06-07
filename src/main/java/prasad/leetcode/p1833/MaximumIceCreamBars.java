package prasad.leetcode.p1833;

import java.util.Arrays;

public class MaximumIceCreamBars {

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int totalCost = 0;
        for (int i = 0; i < costs.length; i++) {
            totalCost += costs[i];
            if (totalCost > coins) {
                return i;
            }
        }
        return costs.length;
    }
}
