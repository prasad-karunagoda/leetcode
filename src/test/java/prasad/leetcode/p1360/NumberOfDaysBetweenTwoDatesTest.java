package prasad.leetcode.p1360;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfDaysBetweenTwoDatesTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new NumberOfDaysBetweenTwoDates().daysBetweenDates("2019-06-29", "2019-06-30"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(15, new NumberOfDaysBetweenTwoDates().daysBetweenDates("2020-01-15", "2019-12-31"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1517, new NumberOfDaysBetweenTwoDates().daysBetweenDates("2020-02-29", "2024-04-25"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1518, new NumberOfDaysBetweenTwoDates().daysBetweenDates("2020-02-28", "2024-04-25"));
    }

    @Test
    public void test05() {
        Assert.assertEquals(56, new NumberOfDaysBetweenTwoDates().daysBetweenDates("2020-02-29", "2020-04-25"));
    }

    @Test
    public void test06() {
        Assert.assertEquals(57, new NumberOfDaysBetweenTwoDates().daysBetweenDates("2020-02-28", "2020-04-25"));
    }

    @Test
    public void test07() {
        Assert.assertEquals(1, new NumberOfDaysBetweenTwoDates().daysBetweenDates("2020-02-28", "2020-02-29"));
    }

    @Test
    public void test08() {
        Assert.assertEquals(3791, new NumberOfDaysBetweenTwoDates().daysBetweenDates("2011-01-25", "2021-06-12"));
    }

    @Test
    public void test09() {
        Assert.assertEquals(503, new NumberOfDaysBetweenTwoDates().daysBetweenDates("2098-10-25", "2100-03-12"));
    }
}
