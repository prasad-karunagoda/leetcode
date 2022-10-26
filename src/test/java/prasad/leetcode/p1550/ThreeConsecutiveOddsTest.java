package prasad.leetcode.p1550;

import org.junit.Assert;
import org.junit.Test;

public class ThreeConsecutiveOddsTest {

    @Test
    public void test01() {
        Assert.assertFalse(new ThreeConsecutiveOdds().threeConsecutiveOdds(new int[] {2,6,4,1}));
    }

    @Test
    public void test02() {
        Assert.assertTrue(new ThreeConsecutiveOdds().threeConsecutiveOdds(new int[] {1,2,34,3,4,5,7,23,12}));
    }

    @Test
    public void test03() {
        Assert.assertTrue(new ThreeConsecutiveOdds().threeConsecutiveOdds(new int[] {1,3,5,7,23,12}));
    }

    @Test
    public void test04() {
        Assert.assertFalse(new ThreeConsecutiveOdds().threeConsecutiveOdds(new int[] {8}));
    }

    @Test
    public void test05() {
        Assert.assertFalse(new ThreeConsecutiveOdds().threeConsecutiveOdds(new int[] {5}));
    }
}
