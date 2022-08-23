package prasad.leetcode.p868;

import org.junit.Assert;
import org.junit.Test;

public class BinaryGapTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new BinaryGap().binaryGap(22));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new BinaryGap().binaryGap(8));
    }

    @Test
    public void test03() {
        Assert.assertEquals(2, new BinaryGap().binaryGap(5));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new BinaryGap().binaryGap(1));
    }

    @Test
    public void testTime() {
        long start = System.currentTimeMillis();
        new BinaryGap().binaryGap(1000000000);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
