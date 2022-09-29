package prasad.leetcode.p2410;

import java.util.Arrays;

public class MaximumMatchingOfPlayersWithTrainers {

    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int matches = 0;
        int t = trainers.length - 1;
        int p = players.length - 1;
        while (t >= 0 && p >= 0) {
            if (trainers[t] >= players[p]) {
                matches++;
                t--;
            }
            p--;
        }
        return matches;
    }
}
