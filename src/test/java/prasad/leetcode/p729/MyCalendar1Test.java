package prasad.leetcode.p729;

import org.junit.Assert;
import org.junit.Test;

public class MyCalendar1Test {

    @Test
    public void test01() {
        MyCalendar1 myCalendar = new MyCalendar1();
        Assert.assertTrue(myCalendar.book(10, 20));
        Assert.assertFalse(myCalendar.book(15, 25));
        Assert.assertTrue(myCalendar.book(20, 30));
        Assert.assertTrue(myCalendar.book(5, 10));
        Assert.assertFalse(myCalendar.book(2, 40));
    }
}
