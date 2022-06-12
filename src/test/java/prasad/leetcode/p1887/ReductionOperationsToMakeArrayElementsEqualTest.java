package prasad.leetcode.p1887;

import org.junit.Assert;
import org.junit.Test;

public class ReductionOperationsToMakeArrayElementsEqualTest {

    @Test
    public void test01() {
        Assert.assertEquals(3, new ReductionOperationsToMakeArrayElementsEqual().reductionOperations(
                new int[] {5,1,3}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new ReductionOperationsToMakeArrayElementsEqual().reductionOperations(
                new int[] {1,1,1}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(4, new ReductionOperationsToMakeArrayElementsEqual().reductionOperations(
                new int[] {1,1,2,2,3}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new ReductionOperationsToMakeArrayElementsEqual().reductionOperations(
                new int[] {5}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(26, new ReductionOperationsToMakeArrayElementsEqual().reductionOperations(
                new int[] {4,7,3,4,6,1,3,4,5,7,1,3}));
    }
}
