package prasad.leetcode.p729;

import java.util.ArrayList;

public class MyCalendar1 {

    private final ArrayList<int[]> bookings;

    public MyCalendar1() {
        bookings = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] b : bookings) {
            if (b[0] < end && b[1] > start) {
                return false;
            }
        }
        bookings.add(new int[] {start, end});
        return true;
    }
}
