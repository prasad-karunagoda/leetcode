package prasad.leetcode.p791;

import org.junit.Assert;
import org.junit.Test;

public class CustomSortStringTest {

    @Test
    public void test01() {
        String orderedStr = new CustomSortString().customSortString("cba", "abcd");
        Assert.assertEquals("cbad", orderedStr);
    }

    @Test
    public void test02() {
        String orderedStr = new CustomSortString().customSortString(null, null);
        Assert.assertNull(orderedStr);
    }

    @Test
    public void test03() {
        String orderedStr = new CustomSortString().customSortString("cba", null);
        Assert.assertNull(orderedStr);
    }

    @Test
    public void test04() {
        String orderedStr = new CustomSortString().customSortString(null, "abcd");
        Assert.assertEquals("abcd", orderedStr);
    }

    @Test
    public void test05() {
        String orderedStr = new CustomSortString().customSortString("", "");
        Assert.assertEquals("", orderedStr);
    }

    @Test
    public void test06() {
        String orderedStr = new CustomSortString().customSortString("cba", "");
        Assert.assertEquals("", orderedStr);
    }

    @Test
    public void test07() {
        String orderedStr = new CustomSortString().customSortString("", "abcd");
        Assert.assertEquals("abcd", orderedStr);
    }
}
