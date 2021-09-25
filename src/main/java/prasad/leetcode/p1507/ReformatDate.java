package prasad.leetcode.p1507;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {

    private static final Map<String, String> monthsMap = new HashMap<>();

    static {
        monthsMap.put("Jan", "01");
        monthsMap.put("Feb", "02");
        monthsMap.put("Mar", "03");
        monthsMap.put("Apr", "04");
        monthsMap.put("May", "05");
        monthsMap.put("Jun", "06");
        monthsMap.put("Jul", "07");
        monthsMap.put("Aug", "08");
        monthsMap.put("Sep", "09");
        monthsMap.put("Oct", "10");
        monthsMap.put("Nov", "11");
        monthsMap.put("Dec", "12");
    }

    public String reformatDate(String date) {
        String[] segments = date.split(" ");
        if (segments.length != 3) {
            throw new IllegalArgumentException("Invalid input date: \"" + date + "\"");
        }

        String day = segments[0];
        String month = segments[1];
        String year = segments[2];

        if (day.length() < 3) {
            throw new IllegalArgumentException("Invalid day in the input date: " + day);
        }
        String dd = day.substring(0, day.length() - 2);
        if (dd.length() == 1) {
            dd = "0" + dd;
        }

        String mm = monthsMap.get(month);
        if (mm == null) {
            throw new IllegalArgumentException("Invalid month in the input date. Valid values are " + monthsMap.keySet());
        }

        return year + "-" + mm + "-" + dd;
    }
}
