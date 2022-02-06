package prasad.leetcode.p2091;

import org.junit.Assert;
import org.junit.Test;

public class RemoveMinAndMaxFromArrayTest {

    @Test
    public void test01() {
        Assert.assertEquals(5, new RemoveMinAndMaxFromArray().minimumDeletions(new int[] {2,10,7,5,4,1,8,6}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(3, new RemoveMinAndMaxFromArray().minimumDeletions(new int[] {0,-4,19,1,8,-2,-3,5}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new RemoveMinAndMaxFromArray().minimumDeletions(new int[] {5}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(5, new RemoveMinAndMaxFromArray().minimumDeletions(new int[] {5,21,4,25,16,3,11,7}));
    }
}
