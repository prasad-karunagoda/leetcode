package prasad.leetcode.p1507;

import org.junit.Assert;
import org.junit.Test;

public class ReformatDateTest {

    @Test
    public void test01() {
        Assert.assertEquals("2052-10-20", new ReformatDate().reformatDate("20th Oct 2052"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("1933-06-06", new ReformatDate().reformatDate("6th Jun 1933"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("1960-05-26", new ReformatDate().reformatDate("26th May 1960"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidMonth() {
        new ReformatDate().reformatDate("26th January 1960");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTooManySpaces() {
        new ReformatDate().reformatDate("26th  Jan 1960");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidDay() {
        new ReformatDate().reformatDate("26 Jan 1960");
    }
}
