package prasad.leetcode.p1356;

import org.junit.Assert;
import org.junit.Test;

public class SortIntegersByNumberOfOneBitsTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {0,1,2,4,8,3,5,6,7},
                new SortIntegersByNumberOfOneBits().sortByBits(new int[] {0,1,2,3,4,5,6,7,8}));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {1,2,4,8,16,32,64,128,256,512,1024},
                new SortIntegersByNumberOfOneBits().sortByBits(new int[] {1024,512,256,128,64,32,16,8,4,2,1}));
    }

    @Test
    public void test03() {
        Assert.assertArrayEquals(new int[] {25},
                new SortIntegersByNumberOfOneBits().sortByBits(new int[] {25}));
    }
}
