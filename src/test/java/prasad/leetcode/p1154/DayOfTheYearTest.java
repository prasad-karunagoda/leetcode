package prasad.leetcode.p1154;

import org.junit.Assert;
import org.junit.Test;

public class DayOfTheYearTest {

    @Test
    public void test01() {
        Assert.assertEquals(9, new DayOfTheYear().dayOfYear("2019-01-09"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(41, new DayOfTheYear().dayOfYear("2019-02-10"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(60, new DayOfTheYear().dayOfYear("2003-03-01"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(61, new DayOfTheYear().dayOfYear("2004-03-01"));
    }

    @Test
    public void test05() {
        Assert.assertEquals(60, new DayOfTheYear().dayOfYear("2008-02-29"));
    }

    @Test
    public void test06() {
        Assert.assertEquals(57, new DayOfTheYear().dayOfYear("2008-02-26"));
    }

    @Test
    public void test07() {
        Assert.assertEquals(365, new DayOfTheYear().dayOfYear("2011-12-31"));
    }

    @Test
    public void test08() {
        Assert.assertEquals(366, new DayOfTheYear().dayOfYear("2012-12-31"));
    }
}
