package prasad.leetcode.p1387;

import org.junit.Assert;
import org.junit.Test;

public class SortIntegersByPowerValueTest {

    @Test
    public void test01() {
        Assert.assertEquals(13, new SortIntegersByPowerValue().getKth(12, 15, 2));
    }

    @Test
    public void test02() {
        Assert.assertEquals(7, new SortIntegersByPowerValue().getKth(7, 11, 4));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new SortIntegersByPowerValue().getKth(1, 1, 1));
    }

    @Test
    public void testTime() {
        long start = System.currentTimeMillis();
        new SortIntegersByPowerValue().getKth(1, 1000, 960);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
