package prasad.leetcode.p539;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumTimeDifference {

    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutesList = new ArrayList<>();
        for (String time : timePoints) {
            minutesList.add(getMinutes(time));
        }
        Collections.sort(minutesList);

        int minimum = 24 * 60;
        for (int i = 0; i < minutesList.size() - 1; i++) {
            int diff = minutesList.get(i + 1) - minutesList.get(i);
            if (diff < minimum) {
                minimum = diff;
            }
        }

        int diffBetweenFirstAndLast = minutesList.get(minutesList.size() - 1) - minutesList.get(0);
        if (diffBetweenFirstAndLast > 12 * 60) {
            diffBetweenFirstAndLast = 24 * 60 - diffBetweenFirstAndLast;
        }

        if (diffBetweenFirstAndLast < minimum) {
            minimum = diffBetweenFirstAndLast;
        }
        return minimum;
    }

    private int getMinutes(String time) {
        String[] hoursAndMinutes = time.split(":");
        return Integer.parseInt(hoursAndMinutes[0]) * 60 + Integer.parseInt(hoursAndMinutes[1]);
    }
}
