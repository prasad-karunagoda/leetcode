package prasad.leetcode.p1471;

import org.junit.Assert;
import org.junit.Test;

public class TheKStrongestValuesInArrayTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {1,5},
                new TheKStrongestValuesInArray().getStrongest(new int[] {1,2,3,4,5}, 2));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {5,5},
                new TheKStrongestValuesInArray().getStrongest(new int[] {1,1,3,5,5}, 2));
    }

    @Test
    public void test03() {
        Assert.assertArrayEquals(new int[] {7,6,6,8,11},
                new TheKStrongestValuesInArray().getStrongest(new int[] {6,7,11,7,6,8}, 5));
    }

    @Test
    public void test04() {
        Assert.assertArrayEquals(new int[] {5},
                new TheKStrongestValuesInArray().getStrongest(new int[] {5}, 1));
    }

    @Test
    public void test05() {
        Assert.assertArrayEquals(new int[] {2,-5,4},
                new TheKStrongestValuesInArray().getStrongest(new int[] {-1,2,-3,4,-5}, 3));
    }
}
