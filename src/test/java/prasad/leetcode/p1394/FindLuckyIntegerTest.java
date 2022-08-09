package prasad.leetcode.p1394;

import org.junit.Assert;
import org.junit.Test;

public class FindLuckyIntegerTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new FindLuckyInteger().findLucky(new int[] {2,2,3,4}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(3, new FindLuckyInteger().findLucky(new int[] {1,2,2,3,3,3}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(-1, new FindLuckyInteger().findLucky(new int[] {2,2,2,3,3}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new FindLuckyInteger().findLucky(new int[] {1}));
    }
}
