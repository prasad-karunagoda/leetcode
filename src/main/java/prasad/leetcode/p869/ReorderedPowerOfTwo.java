package prasad.leetcode.p869;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReorderedPowerOfTwo {

    private static final List<int[]> digitMapList = new ArrayList<>();

    static {
        int powerOfTwo = 1;
        digitMapList.add(buildDigitMap(powerOfTwo));
        while (powerOfTwo * 2 < 1_000_000_000) {
            powerOfTwo = powerOfTwo * 2;
            digitMapList.add(buildDigitMap(powerOfTwo));
        }
    }

    private static int[] buildDigitMap(int powerOfTwo) {
        char[] array = String.valueOf(powerOfTwo).toCharArray();
        int[] digitMap = new int[10];
        for (char c : array) {
            digitMap[c - '0']++;
        }
        return digitMap;
    }

    public boolean reorderedPowerOf2(int n) {
        int[] digitMap = buildDigitMap(n);
        return digitMapList.stream().anyMatch(map -> Arrays.equals(map, digitMap));
    }
}
