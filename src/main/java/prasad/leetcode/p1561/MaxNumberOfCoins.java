package prasad.leetcode.p1561;

import java.util.Arrays;

public class MaxNumberOfCoins {

    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        // Indices:
        // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
        //             -     -     -     -
        int startIndex = piles.length / 3;
        int groupCount = piles.length / 3;
        int coins = 0;
        for (int n = 0; n < groupCount; n++) {
            int index = startIndex + (n * 2);
            coins += piles[index];
        }
        return coins;
    }
}
