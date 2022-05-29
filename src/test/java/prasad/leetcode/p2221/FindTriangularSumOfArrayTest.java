package prasad.leetcode.p2221;

import org.junit.Assert;
import org.junit.Test;

public class FindTriangularSumOfArrayTest {

    @Test
    public void test01() {
        Assert.assertEquals(8, new FindTriangularSumOfArray().triangularSum(new int[] {1,2,3,4,5}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(5, new FindTriangularSumOfArray().triangularSum(new int[] {5}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new FindTriangularSumOfArray().triangularSum(new int[] {4,7,3}));
    }
}
