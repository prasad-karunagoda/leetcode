package prasad.leetcode.p1525;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class NumberOfGoodWaysToSplitStringTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new NumberOfGoodWaysToSplitString().numSplits("aacaba"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new NumberOfGoodWaysToSplitString().numSplits("abcd"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new NumberOfGoodWaysToSplitString().numSplits("a"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new NumberOfGoodWaysToSplitString().numSplits("aa"));
    }

    @Test
    public void testTime() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int n = 1; n <= 100000; n++) {
            sb.append((char) ('a' + random.nextInt(26)));
        }
        long start = System.currentTimeMillis();
        new NumberOfGoodWaysToSplitString().numSplits(sb.toString());
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
