package prasad.leetcode.p1185;

public class DayOfTheWeek {

    private static final int[] daysInMonth = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};

    // Starts from Friday because 1971.01.01 is a Friday
    private static final String[] daysOfWeek = new String[]
            {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};

    public String dayOfTheWeek(int day, int month, int year) {
        // Counting the number of days from 1971.01.01 to the given date
        int numberOfYears = year - 1971;

        // 1972 is a leap year
        int numberOfLeapYears = numberOfYears < 2 ? 0 : ((numberOfYears - 2) / 4) + 1;

        // Number of days in full years
        int numberOfDays = (numberOfYears * 365) + numberOfLeapYears;

        // Number of days in full months
        for (int m = 0; m < month - 1; m++) {
            numberOfDays = numberOfDays + daysInMonth[m];
        }

        numberOfDays = numberOfDays + day - 1;

        // Add an additional day for Feb 29
        if (year % 4 == 0 && month > 2) {
            numberOfDays = numberOfDays + 1;
        }

        // Special condition: if year is divisible by 100, but divisible by 400, it is not a leap year.
        // Since input range of this method is 1971.01.01 to 2100.12.31, this special condition is only applicable
        // for year 2100 in this method.
        if (year == 2100 && month > 2) {
            numberOfDays = numberOfDays - 1;
        }

        int remainder = numberOfDays % 7;
        return daysOfWeek[remainder];
    }
}
