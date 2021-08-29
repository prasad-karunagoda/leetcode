package prasad.leetcode.p1185;

import org.junit.Assert;
import org.junit.Test;

public class DayOfTheWeekTest {

    @Test
    public void test01() {
        Assert.assertEquals("Saturday", new DayOfTheWeek().dayOfTheWeek(31, 8, 2019));
    }

    @Test
    public void test02() {
        Assert.assertEquals("Sunday", new DayOfTheWeek().dayOfTheWeek(18, 7, 1999));
    }

    @Test
    public void test03() {
        Assert.assertEquals("Sunday", new DayOfTheWeek().dayOfTheWeek(15, 8, 1993));
    }

    @Test
    public void test04() {
        Assert.assertEquals("Friday", new DayOfTheWeek().dayOfTheWeek(1, 1, 1971));
    }

    @Test
    public void test05() {
        Assert.assertEquals("Saturday", new DayOfTheWeek().dayOfTheWeek(2, 1, 1971));
    }

    @Test
    public void test06() {
        Assert.assertEquals("Tuesday", new DayOfTheWeek().dayOfTheWeek(31, 8, 2100));
    }
}
