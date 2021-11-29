package prasad.leetcode.p658;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class FindKClosestElementsTest {

    @Test
    public void test01() {
        Assert.assertEquals(Arrays.asList(1,2,3,4),
                new FindKClosestElements().findClosestElements(new int[] {1,2,3,4,5}, 4, 3));
    }

    @Test
    public void test02() {
        Assert.assertEquals(Arrays.asList(1,2,3,4),
                new FindKClosestElements().findClosestElements(new int[] {1,2,3,4,5}, 4, -1));
    }

    @Test
    public void test03() {
        Assert.assertEquals(Arrays.asList(2,3,4,5),
                new FindKClosestElements().findClosestElements(new int[] {1,2,3,4,5}, 4, 7));
    }

    @Test
    public void test04() {
        Assert.assertEquals(Arrays.asList(2,3,4),
                new FindKClosestElements().findClosestElements(new int[] {1,2,3,4,5}, 3, 3));
    }

    @Test
    public void test05() {
        Assert.assertEquals(Collections.singletonList(5),
                new FindKClosestElements().findClosestElements(new int[] {5}, 1, 3));
    }

    @Test
    public void test06() {
        Assert.assertEquals(Arrays.asList(2,3),
                new FindKClosestElements().findClosestElements(new int[] {1,2,2,3,4}, 2, 3));
    }
}
