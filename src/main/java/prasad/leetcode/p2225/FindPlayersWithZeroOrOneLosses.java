package prasad.leetcode.p2225;

import java.util.*;

public class FindPlayersWithZeroOrOneLosses {

    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> losses = new HashMap<>();
        for (int[] m : matches) {
            if (!losses.containsKey(m[0])) {
                losses.put(m[0], 0);
            }

            if (losses.containsKey(m[1])) {
                losses.put(m[1], losses.get(m[1]) + 1);
            }
            else {
                losses.put(m[1], 1);
            }
        }

        ArrayList<Integer> zeroLosses = new ArrayList<>();
        ArrayList<Integer> oneLoss = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : losses.entrySet()) {
            if (entry.getValue() == 0) {
                zeroLosses.add(entry.getKey());
            }
            else if (entry.getValue() == 1) {
                oneLoss.add(entry.getKey());
            }
        }
        Collections.sort(zeroLosses);
        Collections.sort(oneLoss);
        return Arrays.asList(zeroLosses, oneLoss);
    }
}
