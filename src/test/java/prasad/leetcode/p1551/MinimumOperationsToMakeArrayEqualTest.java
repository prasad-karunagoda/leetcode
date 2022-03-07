package prasad.leetcode.p1551;

import org.junit.Assert;
import org.junit.Test;

public class MinimumOperationsToMakeArrayEqualTest {

    @Test
    public void test1() {
        Assert.assertEquals(0, new MinimumOperationsToMakeArrayEqual().minOperations(1));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, new MinimumOperationsToMakeArrayEqual().minOperations(2));
    }

    @Test
    public void test3() {
        Assert.assertEquals(2, new MinimumOperationsToMakeArrayEqual().minOperations(3));
    }

    @Test
    public void test4() {
        Assert.assertEquals(4, new MinimumOperationsToMakeArrayEqual().minOperations(4));
    }

    @Test
    public void test5() {
        Assert.assertEquals(6, new MinimumOperationsToMakeArrayEqual().minOperations(5));
    }

    @Test
    public void test6() {
        Assert.assertEquals(9, new MinimumOperationsToMakeArrayEqual().minOperations(6));
    }
}
