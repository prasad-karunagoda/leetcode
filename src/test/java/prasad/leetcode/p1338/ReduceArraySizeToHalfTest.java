package prasad.leetcode.p1338;

import org.junit.Assert;
import org.junit.Test;

public class ReduceArraySizeToHalfTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new ReduceArraySizeToHalf().minSetSize(new int[] {3,3,3,3,5,5,5,2,2,7}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new ReduceArraySizeToHalf().minSetSize(new int[] {7,7,7,7,7,7}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new ReduceArraySizeToHalf().minSetSize(new int[] {4,5}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(3, new ReduceArraySizeToHalf().minSetSize(new int[] {1,2,3,4,5,6}));
    }
}
