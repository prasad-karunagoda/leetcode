package prasad.leetcode.p869;

import org.junit.Assert;
import org.junit.Test;

public class ReorderedPowerOfTwoTest {

    @Test
    public void test01() {
        Assert.assertTrue(new ReorderedPowerOfTwo().reorderedPowerOf2(1));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new ReorderedPowerOfTwo().reorderedPowerOf2(10));
    }

    @Test
    public void test03() {
        int[] powersOfTwo = new int[] {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192};
        for (int n : powersOfTwo) {
            Assert.assertTrue(new ReorderedPowerOfTwo().reorderedPowerOf2(n));
        }
    }

    @Test
    public void test04() {
        int[] powersOfTwo = new int[] {61, 23, 46, 812, 4021, 8420};
        for (int n : powersOfTwo) {
            Assert.assertTrue(new ReorderedPowerOfTwo().reorderedPowerOf2(n));
        }
    }

    @Test
    public void test05() {
        int[] notPowersOfTwo = new int[] {313, 417, 529};
        for (int n : notPowersOfTwo) {
            Assert.assertFalse(new ReorderedPowerOfTwo().reorderedPowerOf2(n));
        }
    }
}
