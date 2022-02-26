package prasad.leetcode.p1046;

import java.util.ArrayList;
import java.util.Arrays;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = stones.length - 1; i >= 0; i--) {
            list.add(stones[i]);
        }

        while (list.size() > 1) {
            int heaviest = list.remove(0);
            int secondHeaviest = list.remove(0);

            if (heaviest != secondHeaviest) {
                int newWeight = heaviest - secondHeaviest;
                boolean added = false;
                for (int i = 0; i < list.size(); i++) {
                    if (newWeight > list.get(i)) {
                        list.add(i, newWeight);
                        added = true;
                        break;
                    }
                }

                if (!added) {
                    list.add(newWeight);
                }
            }
        }

        return list.isEmpty() ? 0 : list.get(0);
    }
}
