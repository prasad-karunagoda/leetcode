package prasad.leetcode.p771;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {

    @Test
    public void test01() {
        Assert.assertEquals(3, new JewelsAndStones().numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new JewelsAndStones().numJewelsInStones("z", "ZZ"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new JewelsAndStones().numJewelsInStones("z", "z"));
    }
}
