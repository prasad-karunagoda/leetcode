package prasad.leetcode.p57;

public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        int[][] resultingIntervals;

        if (intervals.length == 0) {
            resultingIntervals = new int[1][2];
            resultingIntervals[0] = newInterval;
        }
        else if (newInterval[1] < intervals[0][0]) {
            resultingIntervals = new int[intervals.length + 1][2];
            resultingIntervals[0] = newInterval;
            System.arraycopy(intervals, 0, resultingIntervals, 1, intervals.length);
        }
        else if (newInterval[0] > intervals[intervals.length - 1][1]) {
            resultingIntervals = new int[intervals.length + 1][2];
            System.arraycopy(intervals, 0, resultingIntervals, 0, intervals.length);
            resultingIntervals[resultingIntervals.length - 1] = newInterval;
        }
        else {
            int mergedIntervalStart = -1;
            int firstOverlappedIndex = -1;
            for (int i = 0; i < intervals.length; i++) {
                if (isOverlapping(newInterval, intervals[i])) {
                    mergedIntervalStart = Math.min(newInterval[0], intervals[i][0]);
                    firstOverlappedIndex = i;
                    break;
                }
            }

            int mergedIntervalEnd = -1;
            int lastOverlappedIndex = -1;
            for (int i = intervals.length - 1; i >= 0; i--) {
                if (isOverlapping(newInterval, intervals[i])) {
                    mergedIntervalEnd = Math.max(newInterval[1], intervals[i][1]);
                    lastOverlappedIndex = i;
                    break;
                }
            }

            if (mergedIntervalStart == -1) {
                resultingIntervals = new int[intervals.length + 1][2];
                int lastIndex = -1;
                for (int i = 0; i < intervals.length; i++) {
                    if (newInterval[0] > intervals[i][0]) {
                        resultingIntervals[i] = intervals[i];
                    }
                    else {
                        resultingIntervals[i] = newInterval;
                        lastIndex = i;
                        break;
                    }
                }

                for (int i = lastIndex; i < intervals.length; i++) {
                    resultingIntervals[i + 1] = intervals[i];
                }
            }
            else {
                resultingIntervals = new int[intervals.length - (lastOverlappedIndex - firstOverlappedIndex + 1) + 1][2];
                System.arraycopy(intervals, 0, resultingIntervals, 0, firstOverlappedIndex);
                resultingIntervals[firstOverlappedIndex] = new int[]{mergedIntervalStart, mergedIntervalEnd};
                System.arraycopy(intervals, lastOverlappedIndex + 1,
                        resultingIntervals, firstOverlappedIndex + 1, intervals.length - lastOverlappedIndex - 1);
            }
        }

        return resultingIntervals;
    }

    private boolean isOverlapping(int[] interval1, int[] interval2) {
        int start1 = interval1[0];
        int end1 = interval1[1];
        int start2 = interval2[0];
        int end2 = interval2[1];

        return start1 <= end2 && start2 <= end1;
    }
}
