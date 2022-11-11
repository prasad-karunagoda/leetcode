package prasad.leetcode.p1475;

import java.util.Arrays;

public class FinalPricesWithSpecialDiscount {

    public int[] finalPrices(int[] prices) {
        int[] discountedPrices = Arrays.copyOf(prices, prices.length);
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    discountedPrices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return discountedPrices;
    }
}
