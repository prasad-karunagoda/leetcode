package prasad.leetcode.p540;

import org.junit.Assert;
import org.junit.Test;

public class SingleElementInSortedArrayTest {

    @Test
    public void test01() {
        Assert.assertEquals(2,
                new SingleElementInSortedArray().singleNonDuplicate(new int[] {1,1,2,3,3,4,4,8,8}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(10,
                new SingleElementInSortedArray().singleNonDuplicate(new int[] {3,3,7,7,10,11,11}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(5,
                new SingleElementInSortedArray().singleNonDuplicate(new int[] {5}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(5,
                new SingleElementInSortedArray().singleNonDuplicate(new int[] {3,3,5}));
    }

    @Test
    public void test05() {
        Assert.assertEquals(1,
                new SingleElementInSortedArray().singleNonDuplicate(new int[] {1,2,2,3,3}));
    }
}
