package prasad.leetcode.p781;

public class RabbitsInForest {

    public int numRabbits(int[] answers) {
        int count = 0;
        int[] map = new int[1000];
        for (int n : answers) {
            map[n]++;
        }
        for (int n = 0; n < map.length; n++) {
            if (map[n] > 0) {
                int groups = map[n] / (n + 1);
                if (map[n] % (n + 1) > 0) {
                    groups++;
                }
                count += groups * (n + 1);
            }
        }
        return count;
    }
}
