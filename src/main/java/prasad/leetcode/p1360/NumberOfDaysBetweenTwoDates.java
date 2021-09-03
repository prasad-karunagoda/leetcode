package prasad.leetcode.p1360;

import java.time.LocalDate;
import java.util.Arrays;

public class NumberOfDaysBetweenTwoDates {

    private static final int[] numberOfDaysInMonth = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int daysBetweenDates(String date1, String date2) {
        String[] dates = new String[] {date1, date2};
        Arrays.sort(dates);
        LocalDate from = parseDate(dates[0]);
        LocalDate to = parseDate(dates[1]);

        if (from.getYear() == to.getYear() && from.getMonthValue() == to.getMonthValue()) {
            return to.getDayOfMonth() - from.getDayOfMonth();
        }
        else if (from.getYear() == to.getYear()) {
            int days = numberOfDaysInMonth[from.getMonthValue() - 1] - from.getDayOfMonth();
            for (int m = from.getMonthValue(); m < to.getMonthValue() - 1; m++) {
                days = days + numberOfDaysInMonth[m];
            }
            days = days + to.getDayOfMonth();
            if (from.getMonthValue() <= 2 && to.getMonthValue() > 2 && isLeapYear(from.getYear())) {
                days++;
            }
            return days;
        }
        else {
            int days = numberOfDaysInMonth[from.getMonthValue() - 1] - from.getDayOfMonth();
            for (int m = from.getMonthValue(); m < 12; m++) {
                days = days + numberOfDaysInMonth[m];
            }
            if (from.getMonthValue() <= 2 && isLeapYear(from.getYear())) {
                days++;
            }
            for (int y = from.getYear() + 1; y < to.getYear(); y++) {
                if (isLeapYear(y)) {
                    days = days + 366;
                }
                else {
                    days = days + 365;
                }
            }
            for (int m = 0; m < to.getMonthValue() - 1; m++) {
                days = days + numberOfDaysInMonth[m];
            }
            days = days + to.getDayOfMonth();
            if (to.getMonthValue() > 2 && isLeapYear(to.getYear())) {
                days++;
            }
            return days;
        }
    }

    private LocalDate parseDate(String date) {
        String[] yearMonthDay = date.split("-");
        return LocalDate.of(
                Integer.parseInt(yearMonthDay[0]),
                Integer.parseInt(yearMonthDay[1]),
                Integer.parseInt(yearMonthDay[2]));
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}
