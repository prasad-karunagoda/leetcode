package prasad.leetcode.p1154;

import java.util.HashMap;
import java.util.Map;

public class DayOfTheYear {

    private static Map<Integer, Integer> daysOfMonth = new HashMap<>();

    static {
        daysOfMonth.put(1, 31);
        daysOfMonth.put(2, 28);
        daysOfMonth.put(3, 31);
        daysOfMonth.put(4, 30);
        daysOfMonth.put(5, 31);
        daysOfMonth.put(6, 30);
        daysOfMonth.put(7, 31);
        daysOfMonth.put(8, 31);
        daysOfMonth.put(9, 30);
        daysOfMonth.put(10, 31);
        daysOfMonth.put(11, 30);
        daysOfMonth.put(12, 31);
    }

    public int dayOfYear(String date) {
        // date is in the format YYYY-MM-DD
        String[] yearMonthDay = date.split("-");
        int year = Integer.parseInt(yearMonthDay[0]);
        int month = Integer.parseInt(yearMonthDay[1]);
        int day = Integer.parseInt(yearMonthDay[2]);

        int dayOfYear = 0;

        for (int i = 1; i < month; i++) {
            dayOfYear = dayOfYear + daysOfMonth.get(i);
        }

        dayOfYear = dayOfYear + day;

        boolean isLeapYear = year % 4 == 0;
        if (isLeapYear && month > 2) {
            dayOfYear++;
        }

        return dayOfYear;
    }
}
