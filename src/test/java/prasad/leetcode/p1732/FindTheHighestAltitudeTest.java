package prasad.leetcode.p1732;

import org.junit.Assert;
import org.junit.Test;

public class FindTheHighestAltitudeTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new FindTheHighestAltitude().largestAltitude(new int[] {-5,1,5,0,-7}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new FindTheHighestAltitude().largestAltitude(new int[] {-4,-3,-2,-1,4,3,2}));
    }
}
