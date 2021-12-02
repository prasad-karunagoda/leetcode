package prasad.leetcode.p1985;

import org.junit.Assert;
import org.junit.Test;

public class FindKthLargestIntegerInArrayTest {

    @Test
    public void test01() {
        Assert.assertEquals("3", new FindKthLargestIntegerInArray().kthLargestNumber(
                new String[] {"3","6","7","10"}, 4));
    }

    @Test
    public void test02() {
        Assert.assertEquals("2", new FindKthLargestIntegerInArray().kthLargestNumber(
                new String[] {"2","21","12","1"}, 3));
    }

    @Test
    public void test03() {
        Assert.assertEquals("0", new FindKthLargestIntegerInArray().kthLargestNumber(
                new String[] {"0","0"}, 2));
    }

    @Test
    public void test04() {
        Assert.assertEquals("123", new FindKthLargestIntegerInArray().kthLargestNumber(
                new String[] {"123"}, 1));
    }
}
