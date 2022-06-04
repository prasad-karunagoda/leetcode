package prasad.leetcode.p1094;

import org.junit.Assert;
import org.junit.Test;

public class CarPoolingTest {

    @Test
    public void test01() {
        Assert.assertFalse(new CarPooling().carPooling(new int[][] {{2,1,5},{3,3,7}}, 4));
    }

    @Test
    public void test02() {
        Assert.assertTrue(new CarPooling().carPooling(new int[][] {{2,1,5},{3,3,7}}, 5));
    }

    @Test
    public void test03() {
        Assert.assertTrue(new CarPooling().carPooling(new int[][] {{5,12,25}}, 5));
    }

    @Test
    public void test04() {
        Assert.assertFalse(new CarPooling().carPooling(new int[][] {{6,12,25}}, 5));
    }

    @Test
    public void test05() {
        Assert.assertTrue(new CarPooling().carPooling(new int[][] {{2,1,5},{3,5,7}}, 4));
    }
}
