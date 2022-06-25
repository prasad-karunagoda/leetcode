package prasad.leetcode.p1402;

import java.util.Arrays;

public class ReducingDishes {

    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int startIndex = -1;
        for (int i = 0; i < satisfaction.length; i++) {
            int sum = 0;
            for (int j = i; j < satisfaction.length; j++) {
                sum += satisfaction[j];
            }

            if (sum >= 0) {
                startIndex = i;
                break;
            }
        }

        if (startIndex == -1) {
            return 0;
        }

        int time = 1;
        int maxLikeSum = 0;
        for (int i = startIndex; i < satisfaction.length; i++) {
            maxLikeSum += satisfaction[i] * time;
            time++;
        }
        return maxLikeSum;
    }
}
