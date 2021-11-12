package prasad.leetcode.p788;

import org.junit.Assert;
import org.junit.Test;

public class RotatedDigitsTest {

    @Test
    public void test01() {
        Assert.assertEquals(4, new RotatedDigits().rotatedDigits(10));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new RotatedDigits().rotatedDigits(1));
    }

    @Test
    public void testTime() {
        long start = System.currentTimeMillis();
        new RotatedDigits().rotatedDigits(10000);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
