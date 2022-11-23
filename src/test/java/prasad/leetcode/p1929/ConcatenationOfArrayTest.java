package prasad.leetcode.p1929;

import org.junit.Assert;
import org.junit.Test;

public class ConcatenationOfArrayTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {1,2,1,1,2,1},
                new ConcatenationOfArray().getConcatenation(new int[] {1,2,1}));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {1,3,2,1,1,3,2,1},
                new ConcatenationOfArray().getConcatenation(new int[] {1,3,2,1}));
    }

    @Test
    public void test03() {
        Assert.assertArrayEquals(new int[] {5,5},
                new ConcatenationOfArray().getConcatenation(new int[] {5}));
    }
}
