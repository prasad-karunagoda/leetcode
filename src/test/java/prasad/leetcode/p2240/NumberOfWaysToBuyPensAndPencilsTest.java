package prasad.leetcode.p2240;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfWaysToBuyPensAndPencilsTest {

    @Test
    public void test01() {
        Assert.assertEquals(9, new NumberOfWaysToBuyPensAndPencils().waysToBuyPensPencils(20, 10, 5));
    }

    @Test
    public void test02() {
        Assert.assertEquals(9, new NumberOfWaysToBuyPensAndPencils().waysToBuyPensPencils(20, 5, 10));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new NumberOfWaysToBuyPensAndPencils().waysToBuyPensPencils(5, 10, 10));
    }
}
