package prasad.leetcode.p2165;

import org.junit.Assert;
import org.junit.Test;

public class SmallestValueOfRearrangedNumberTest {

    @Test
    public void test01() {
        Assert.assertEquals(103, new SmallestValueOfRearrangedNumber().smallestNumber(310));
    }

    @Test
    public void test02() {
        Assert.assertEquals(-7650, new SmallestValueOfRearrangedNumber().smallestNumber(-7605));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new SmallestValueOfRearrangedNumber().smallestNumber(0));
    }

    @Test
    public void test04() {
        Assert.assertEquals(20023467, new SmallestValueOfRearrangedNumber().smallestNumber(70326024));
    }

    @Test
    public void test05() {
        Assert.assertEquals(-887764200, new SmallestValueOfRearrangedNumber().smallestNumber(-807260487));
    }
}
