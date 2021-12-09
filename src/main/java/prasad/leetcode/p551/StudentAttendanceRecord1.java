package prasad.leetcode.p551;

public class StudentAttendanceRecord1 {

    public boolean checkRecord(String s) {
        int absentDays = 0;
        int consecutiveLateDays = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                absentDays++;
                consecutiveLateDays = 0;
            }
            else if (c == 'L') {
                consecutiveLateDays++;
            }
            else {
                consecutiveLateDays = 0;
            }

            if (absentDays == 2 || consecutiveLateDays == 3) {
                return false;
            }
        }
        return true;
    }
}
