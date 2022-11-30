package prasad.leetcode.p1710;

import java.util.Arrays;

public class MaximumUnitsOnTruck {

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (t1, t2) -> Integer.compare(t2[1], t1[1]));
        int totalBoxes = 0;
        int totalUnits = 0;
        for (int[] type : boxTypes) {
            int remainingSpace = truckSize - totalBoxes;
            if (remainingSpace >= type[0]) {
                totalBoxes += type[0];
                totalUnits += type[0] * type[1];
            }
            else {
                totalUnits += remainingSpace * type[1];
                break;
            }
        }
        return totalUnits;
    }
}
