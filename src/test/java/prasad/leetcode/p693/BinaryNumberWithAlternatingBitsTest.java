package prasad.leetcode.p693;

import org.junit.Assert;
import org.junit.Test;

public class BinaryNumberWithAlternatingBitsTest {

    @Test
    public void test01() {
        Assert.assertTrue(new BinaryNumberWithAlternatingBits().hasAlternatingBits(5));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new BinaryNumberWithAlternatingBits().hasAlternatingBits(7));
    }

    @Test
    public void test03() {
        Assert.assertFalse(new BinaryNumberWithAlternatingBits().hasAlternatingBits(11));
    }

    @Test
    public void test04() {
        Assert.assertTrue(new BinaryNumberWithAlternatingBits().hasAlternatingBits(1));
    }
}
