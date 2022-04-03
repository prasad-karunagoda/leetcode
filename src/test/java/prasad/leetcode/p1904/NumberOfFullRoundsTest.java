package prasad.leetcode.p1904;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NumberOfFullRoundsTest {

    @Test
    public void testNumberOfRounds01() {
        Assert.assertEquals(1, new NumberOfFullRounds().numberOfRounds("09:31", "10:14"));
    }

    @Test
    public void testNumberOfRounds02() {
        Assert.assertEquals(22, new NumberOfFullRounds().numberOfRounds("21:30", "03:00"));
    }

    @Test
    public void testNumberOfRounds03() {
        Assert.assertEquals(0, new NumberOfFullRounds().numberOfRounds("21:17", "21:37"));
    }

    @Test
    public void testNumberOfRounds04() {
        Assert.assertEquals(0, new NumberOfFullRounds().numberOfRounds("23:46", "23:58"));
    }

    @Test
    public void testNumberOfRounds05() {
        Assert.assertEquals(0, new NumberOfFullRounds().numberOfRounds("23:35", "23:55"));
    }

    @Test
    public void testNumberOfRounds06() {
        Assert.assertEquals(95, new NumberOfFullRounds().numberOfRounds("00:12", "00:08"));
    }

    @Test
    public void testNumberOfRounds07() {
        Assert.assertEquals(0, new NumberOfFullRounds().numberOfRounds("23:52", "00:04"));
    }


    // adjustToNext15Minute()

    @Test
    public void testAdjustToNext15Minute_0812() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(8, 12));
        LocalDateTime expected = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(8, 15));
        Assert.assertEquals(expected, new NumberOfFullRounds().adjustToNext15Minute(dateTime));
    }

    @Test
    public void testAdjustToNext15Minute_1017() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(10, 17));
        LocalDateTime expected = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(10, 30));
        Assert.assertEquals(expected, new NumberOfFullRounds().adjustToNext15Minute(dateTime));
    }

    @Test
    public void testAdjustToNext15Minute_1441() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(14, 41));
        LocalDateTime expected = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(14, 45));
        Assert.assertEquals(expected, new NumberOfFullRounds().adjustToNext15Minute(dateTime));
    }

    @Test
    public void testAdjustToNext15Minute_1751() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(17, 51));
        LocalDateTime expected = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(18, 0));
        Assert.assertEquals(expected, new NumberOfFullRounds().adjustToNext15Minute(dateTime));
    }

    @Test
    public void testAdjustToNext15Minute_2354() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(23, 54));
        LocalDateTime expected = LocalDateTime.of(LocalDate.of(2022, 1, 2), LocalTime.of(0, 0));
        Assert.assertEquals(expected, new NumberOfFullRounds().adjustToNext15Minute(dateTime));
    }

    @Test
    public void testAdjustToNext15Minute_1615() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(16, 15));
        LocalDateTime expected = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(16, 15));
        Assert.assertEquals(expected, new NumberOfFullRounds().adjustToNext15Minute(dateTime));
    }

    @Test
    public void testAdjustToNext15Minute_1300() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(13, 0));
        LocalDateTime expected = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(13, 0));
        Assert.assertEquals(expected, new NumberOfFullRounds().adjustToNext15Minute(dateTime));
    }


    // adjustToPrevious15Minute()

    @Test
    public void testAdjustToPrevious15Minute_0812() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(8, 12));
        LocalDateTime expected = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(8, 0));
        Assert.assertEquals(expected, new NumberOfFullRounds().adjustToPrevious15Minute(dateTime));
    }

    @Test
    public void testAdjustToPrevious15Minute_1518() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(15, 18));
        LocalDateTime expected = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(15, 15));
        Assert.assertEquals(expected, new NumberOfFullRounds().adjustToPrevious15Minute(dateTime));
    }

    @Test
    public void testAdjustToPrevious15Minute_1841() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(18, 41));
        LocalDateTime expected = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(18, 30));
        Assert.assertEquals(expected, new NumberOfFullRounds().adjustToPrevious15Minute(dateTime));
    }

    @Test
    public void testAdjustToPrevious15Minute_1952() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(19, 52));
        LocalDateTime expected = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(19, 45));
        Assert.assertEquals(expected, new NumberOfFullRounds().adjustToPrevious15Minute(dateTime));
    }

    @Test
    public void testAdjustToPrevious15Minute_2130() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(21, 30));
        LocalDateTime expected = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(21, 30));
        Assert.assertEquals(expected, new NumberOfFullRounds().adjustToPrevious15Minute(dateTime));
    }

    @Test
    public void testAdjustToPrevious15Minute_2200() {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(22, 0));
        LocalDateTime expected = LocalDateTime.of(LocalDate.of(2022, 1, 1), LocalTime.of(22, 0));
        Assert.assertEquals(expected, new NumberOfFullRounds().adjustToPrevious15Minute(dateTime));
    }
}
