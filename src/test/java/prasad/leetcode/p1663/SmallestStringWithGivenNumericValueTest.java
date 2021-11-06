package prasad.leetcode.p1663;

import org.junit.Assert;
import org.junit.Test;

public class SmallestStringWithGivenNumericValueTest {

    @Test
    public void test01() {
        Assert.assertEquals("aay",
                new SmallestStringWithGivenNumericValue().getSmallestString(3, 27));
    }

    @Test
    public void test02() {
        Assert.assertEquals("aaszz",
                new SmallestStringWithGivenNumericValue().getSmallestString(5, 73));
    }

    @Test
    public void test03() {
        Assert.assertEquals("c",
                new SmallestStringWithGivenNumericValue().getSmallestString(1, 3));
    }

    @Test
    public void test04() {
        Assert.assertEquals("aaaaaaaaaaaaaaaaa",
                new SmallestStringWithGivenNumericValue().getSmallestString(17, 17));
    }

    @Test
    public void test05() {
        Assert.assertEquals("aaaaaaaaaaaaaaaab",
                new SmallestStringWithGivenNumericValue().getSmallestString(17, 18));
    }
}
