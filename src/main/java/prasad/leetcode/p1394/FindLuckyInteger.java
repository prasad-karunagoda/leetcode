package prasad.leetcode.p1394;

public class FindLuckyInteger {

    public int findLucky(int[] arr) {
        short[] map = new short[501];
        for (int n : arr) {
            map[n]++;
        }

        for (int i = map.length - 1; i >= 1; i--) {
            if (map[i] == i) {
                return i;
            }
        }
        return -1;
    }
}
