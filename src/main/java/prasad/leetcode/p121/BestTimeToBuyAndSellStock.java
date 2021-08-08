package prasad.leetcode.p121;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int minPriceInPast = prices[0];
        int maxProfit = 0;
        for (int sellingDay = 1; sellingDay < prices.length; sellingDay++) {
            int maxProfitIfSellOnCurrentDay = prices[sellingDay] - minPriceInPast;
            maxProfit = Math.max(maxProfit, maxProfitIfSellOnCurrentDay);
            minPriceInPast = Math.min(minPriceInPast, prices[sellingDay]);
        }
        return maxProfit;
    }

    public int maxProfitTooSlow(int[] prices) {
        int max = 0;
        for (int buyOn = 0; buyOn < prices.length; buyOn++) {
            for (int sellOn = buyOn + 1; sellOn < prices.length; sellOn++) {
                max = Math.max(max, prices[sellOn] - prices[buyOn]);
            }
        }
        return max;
    }
}
