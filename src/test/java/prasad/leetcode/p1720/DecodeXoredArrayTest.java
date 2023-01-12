package prasad.leetcode.p1720;

import org.junit.Assert;
import org.junit.Test;

public class DecodeXoredArrayTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {1,0,2,1},
                new DecodeXoredArray().decode(new int[] {1,2,3}, 1));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {4,2,0,7,4},
                new DecodeXoredArray().decode(new int[] {6,2,7,3}, 4));
    }

    @Test
    public void test03() {
        Assert.assertArrayEquals(new int[] {4,1},
                new DecodeXoredArray().decode(new int[] {5}, 4));
    }
}
