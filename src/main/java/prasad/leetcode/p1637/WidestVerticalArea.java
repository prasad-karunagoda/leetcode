package prasad.leetcode.p1637;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class WidestVerticalArea {

    public int maxWidthOfVerticalArea(int[][] points) {
        HashSet<Integer> set = new HashSet<>();
        for (int[] p : points) {
            set.add(p[0]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int widest = 0;
        for (int i = 0; i <= list.size() - 2; i++) {
            int gap = list.get(i + 1) - list.get(i);
            if (gap > widest) {
                widest = gap;
            }
        }
        return widest;
    }
}
