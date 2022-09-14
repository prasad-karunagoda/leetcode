package prasad.leetcode.p728;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SelfDividingNumbersTest {

    @Test
    public void test01() {
        List<Integer> result = new SelfDividingNumbers().selfDividingNumbers(1, 22);
        Assert.assertEquals(Arrays.asList(1,2,3,4,5,6,7,8,9,11,12,15,22), result);
    }

    @Test
    public void test02() {
        List<Integer> result = new SelfDividingNumbers().selfDividingNumbers(47, 85);
        Assert.assertEquals(Arrays.asList(48,55,66,77), result);
    }

    @Test
    public void testTime() {
        long start = System.currentTimeMillis();
        new SelfDividingNumbers().selfDividingNumbers(1, 10000);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
