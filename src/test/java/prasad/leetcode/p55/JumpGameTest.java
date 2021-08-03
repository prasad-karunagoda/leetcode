package prasad.leetcode.p55;

import org.junit.Assert;
import org.junit.Test;

public class JumpGameTest {

    @Test
    public void test01() {
        Assert.assertTrue(new JumpGame().canJump(new int[] {2,3,1,1,4}));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new JumpGame().canJump(new int[] {3,2,1,0,4}));
    }

    @Test
    public void test03() {
        Assert.assertTrue(new JumpGame().canJump(new int[] {0}));
    }

    @Test
    public void test04() {
        Assert.assertTrue(new JumpGame().canJump(new int[] {1}));
    }
}
