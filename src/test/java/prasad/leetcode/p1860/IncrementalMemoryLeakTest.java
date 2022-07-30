package prasad.leetcode.p1860;

import org.junit.Assert;
import org.junit.Test;

public class IncrementalMemoryLeakTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {3,1,0}, new IncrementalMemoryLeak().memLeak(2, 2));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {6,0,4}, new IncrementalMemoryLeak().memLeak(8, 11));
    }

    @Test
    public void testTime() {
        long start = System.currentTimeMillis();
        new IncrementalMemoryLeak().memLeak(Integer.MAX_VALUE, Integer.MAX_VALUE);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
