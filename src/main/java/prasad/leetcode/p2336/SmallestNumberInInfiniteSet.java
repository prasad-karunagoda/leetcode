package prasad.leetcode.p2336;

import java.util.ArrayList;

public class SmallestNumberInInfiniteSet {

    private int smallestInSeries;
    private final ArrayList<Integer> added;

    public SmallestNumberInInfiniteSet() {
        smallestInSeries = 1;
        added = new ArrayList<>();
    }

    public int popSmallest() {
        if (!added.isEmpty()) {
            return added.remove(0);
        }
        return smallestInSeries++;
    }

    public void addBack(int num) {
        if (num < smallestInSeries && !added.contains(num)) {
            boolean isAdded = false;
            for (int i = 0; i < added.size(); i++) {
                if (num < added.get(i)) {
                    added.add(i, num);
                    isAdded = true;
                    break;
                }
            }

            if (!isAdded) {
                added.add(num);
            }
        }
    }
}
