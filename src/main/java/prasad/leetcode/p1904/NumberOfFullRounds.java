package prasad.leetcode.p1904;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class NumberOfFullRounds {

    public int numberOfRounds(String loginTime, String logoutTime) {
        LocalTime login = LocalTime.parse(loginTime);
        LocalTime logout = LocalTime.parse(logoutTime);
        if (login.isBefore(logout)) {
            LocalDateTime loginDataTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), login);
            LocalDateTime logoutDataTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), logout);
            loginDataTime = adjustToNext15Minute(loginDataTime);
            logoutDataTime = adjustToPrevious15Minute(logoutDataTime);
            int diff = (int) loginDataTime.until(logoutDataTime, ChronoUnit.MINUTES);
            return diff < 0 ? 0 : diff / 15;
        }
        else {
            LocalDateTime loginDataTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), login);
            LocalDateTime logoutDataTime = LocalDateTime.of(LocalDate.of(2022, 1, 2), logout);
            loginDataTime = adjustToNext15Minute(loginDataTime);
            logoutDataTime = adjustToPrevious15Minute(logoutDataTime);
            int loginToMidnight = (24 * 60) - (int) LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(0, 0)).until(loginDataTime, ChronoUnit.MINUTES);
            int midnightToLogout = (int) LocalDateTime.of(LocalDate.of(2022, 1, 2), LocalTime.of(0, 0)).until(logoutDataTime, ChronoUnit.MINUTES);
            return (loginToMidnight + midnightToLogout) / 15;
        }
    }

    LocalDateTime adjustToNext15Minute(LocalDateTime dateTime) {
        int remainder = dateTime.getMinute() % 15;
        return remainder == 0 ? dateTime : dateTime.plusMinutes(15 - remainder);
    }

    LocalDateTime adjustToPrevious15Minute(LocalDateTime dateTime) {
        int remainder = dateTime.getMinute() % 15;
        return remainder == 0 ? dateTime : dateTime.minusMinutes(remainder);
    }
}
