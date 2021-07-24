package prasad.leetcode.p34;

import org.junit.Assert;
import org.junit.Test;

public class FindFirstAndLastPositionTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {3, 4},
                new FindFirstAndLastPosition().searchRange(new int[] {5,7,7,8,8,10}, 8));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {-1, -1},
                new FindFirstAndLastPosition().searchRange(new int[] {5,7,7,8,8,10}, 6));
    }

    @Test
    public void test03() {
        Assert.assertArrayEquals(new int[] {-1, -1},
                new FindFirstAndLastPosition().searchRange(new int[0], 0));
    }

    @Test
    public void test04() {
        Assert.assertArrayEquals(new int[] {-1, -1},
                new FindFirstAndLastPosition().searchRange(new int[] {5}, 3));
    }

    @Test
    public void test05() {
        Assert.assertArrayEquals(new int[] {-1, -1},
                new FindFirstAndLastPosition().searchRange(new int[] {5}, 7));
    }

    @Test
    public void test06() {
        Assert.assertArrayEquals(new int[] {0, 0},
                new FindFirstAndLastPosition().searchRange(new int[] {5}, 5));
    }

    @Test
    public void test07() {
        Assert.assertArrayEquals(new int[] {3, 6},
                new FindFirstAndLastPosition().searchRange(new int[] {5,7,7,8,8,8,8,10}, 8));
    }

    @Test
    public void test08() {
        Assert.assertArrayEquals(new int[] {1, 4},
                new FindFirstAndLastPosition().searchRange(new int[] {5,7,7,7,7,8,8,10}, 7));
    }

    @Test
    public void test09() {
        Assert.assertArrayEquals(new int[] {0, 1},
                new FindFirstAndLastPosition().searchRange(new int[] {2,2}, 2));
    }
}
