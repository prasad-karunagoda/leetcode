package prasad.leetcode.p326;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfThreeTest {

    @Test
    public void test27() {
        Assert.assertTrue(new PowerOfThree().isPowerOfThree(27));
    }

    @Test
    public void test0() {
        Assert.assertFalse(new PowerOfThree().isPowerOfThree(0));
    }

    @Test
    public void test9() {
        Assert.assertTrue(new PowerOfThree().isPowerOfThree(9));
    }

    @Test
    public void test45() {
        Assert.assertFalse(new PowerOfThree().isPowerOfThree(45));
    }

    @Test
    public void testMinus5() {
        Assert.assertFalse(new PowerOfThree().isPowerOfThree(-5));
    }

    @Test
    public void testMinus9() {
        Assert.assertFalse(new PowerOfThree().isPowerOfThree(-9));
    }
}
