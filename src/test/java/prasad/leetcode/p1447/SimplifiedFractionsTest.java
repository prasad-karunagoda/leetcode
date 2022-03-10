package prasad.leetcode.p1447;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SimplifiedFractionsTest {

    @Test
    public void test1() {
        List<String> fractions = new SimplifiedFractions().simplifiedFractions(1);
        Assert.assertEquals(0, fractions.size());
    }

    @Test
    public void test2() {
        List<String> fractions = new SimplifiedFractions().simplifiedFractions(2);
        Assert.assertEquals(1, fractions.size());
        Assert.assertEquals("1/2", fractions.get(0));
    }

    @Test
    public void test3() {
        List<String> fractions = new SimplifiedFractions().simplifiedFractions(3);
        Assert.assertEquals(3, fractions.size());
        Assert.assertTrue(fractions.containsAll(Arrays.asList("1/2", "1/3", "2/3")));
    }

    @Test
    public void test4() {
        List<String> fractions = new SimplifiedFractions().simplifiedFractions(4);
        Assert.assertEquals(5, fractions.size());
        Assert.assertTrue(fractions.containsAll(Arrays.asList("1/2", "1/3", "2/3", "1/4", "3/4")));
    }

    @Test
    public void testTime() {
        long start = System.currentTimeMillis();
        new SimplifiedFractions().simplifiedFractions(100);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
