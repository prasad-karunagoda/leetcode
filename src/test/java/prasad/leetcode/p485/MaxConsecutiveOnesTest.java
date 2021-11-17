package prasad.leetcode.p485;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesTest {

    @Test
    public void test01() {
        Assert.assertEquals(3, new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[] {1}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new MaxConsecutiveOnes().findMaxConsecutiveOnes(new int[] {0}));
    }
}
