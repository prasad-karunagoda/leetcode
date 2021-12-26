package prasad.leetcode.p1404;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfStepsToReduceBinaryToOneTest {

    @Test
    public void test01() {
        Assert.assertEquals(6, new NumberOfStepsToReduceBinaryToOne().numSteps("1101"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new NumberOfStepsToReduceBinaryToOne().numSteps("10"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new NumberOfStepsToReduceBinaryToOne().numSteps("1"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(70, new NumberOfStepsToReduceBinaryToOne().numSteps(
                "10000000000000000000000000000000000000000000000000000000000000000000000"));
    }

    @Test
    public void testAddOne01() {
        Assert.assertEquals("1110", new NumberOfStepsToReduceBinaryToOne().addOne("1101"));
    }

    @Test
    public void testAddOne02() {
        Assert.assertEquals("1", new NumberOfStepsToReduceBinaryToOne().addOne("0"));
    }

    @Test
    public void testAddOne03() {
        Assert.assertEquals("10", new NumberOfStepsToReduceBinaryToOne().addOne("1"));
    }

    @Test
    public void testAddOne04() {
        Assert.assertEquals("100", new NumberOfStepsToReduceBinaryToOne().addOne("11"));
    }
}
