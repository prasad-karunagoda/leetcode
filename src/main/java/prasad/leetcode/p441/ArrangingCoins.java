package prasad.leetcode.p441;

public class ArrangingCoins {

    public int arrangeCoins(int n) {
        int rows = 0;
        long usedCoins = 0;
        while (n > usedCoins + rows) {
            rows++;
            usedCoins = usedCoins + rows;
        }
        return rows;
    }
}
