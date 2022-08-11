package prasad.leetcode.p1051;

import org.junit.Assert;
import org.junit.Test;

public class HeightCheckerTest {

    @Test
    public void test01() {
        Assert.assertEquals(3, new HeightChecker().heightChecker(new int[] {1,1,4,2,1,3}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(5, new HeightChecker().heightChecker(new int[] {5,1,2,3,4}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new HeightChecker().heightChecker(new int[] {1,2,3,4,5}));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new HeightChecker().heightChecker(new int[] {5}));
    }
}
