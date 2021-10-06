package prasad.leetcode.p350;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class IntersectionOfTwoArrays2Test {

    @Test
    public void test01() {
        int[] intersection = new IntersectionOfTwoArrays2().intersect(new int[] {1,2,2,1}, new int[] {2,2});
        Arrays.sort(intersection);
        Assert.assertArrayEquals(new int[] {2,2}, intersection);
    }

    @Test
    public void test02() {
        int[] intersection = new IntersectionOfTwoArrays2().intersect(new int[] {4,9,5}, new int[] {9,4,9,8,4});
        Arrays.sort(intersection);
        Assert.assertArrayEquals(new int[] {4,9}, intersection);
    }

    @Test
    public void test03() {
        int[] intersection = new IntersectionOfTwoArrays2().intersect(new int[] {4}, new int[] {5});
        Arrays.sort(intersection);
        Assert.assertArrayEquals(new int[0], intersection);
    }

    @Test
    public void test04() {
        int[] intersection = new IntersectionOfTwoArrays2().intersect(new int[] {0}, new int[] {0});
        Arrays.sort(intersection);
        Assert.assertArrayEquals(new int[] {0}, intersection);
    }
}
