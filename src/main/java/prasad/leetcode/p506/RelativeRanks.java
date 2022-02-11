package prasad.leetcode.p506;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

    public String[] findRelativeRanks(int[] score) {
        int[] sorted = Arrays.copyOf(score, score.length);
        Arrays.sort(sorted);
        Map<Integer, Integer> scoreToPlaceMap = new HashMap<>();
        for (int i = 0; i < sorted.length; i++) {
            scoreToPlaceMap.put(sorted[i], sorted.length - i);
        }

        String[] ranks = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int place = scoreToPlaceMap.get(score[i]);
            if (place == 1) {
                ranks[i] = "Gold Medal";
            }
            else if (place == 2) {
                ranks[i] = "Silver Medal";
            }
            else if (place == 3) {
                ranks[i] = "Bronze Medal";
            }
            else {
                ranks[i] = String.valueOf(place);
            }
        }
        return ranks;
    }
}
