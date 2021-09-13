package prasad.leetcode.p283;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

    @Test
    public void test01() {
        int[] nums = new int[] {0,1,0,3,12};
        new MoveZeroes().moveZeroes(nums);
        Assert.assertArrayEquals(new int[] {1,3,12,0,0}, nums);
    }

    @Test
    public void test02() {
        int[] nums = new int[] {0};
        new MoveZeroes().moveZeroes(nums);
        Assert.assertArrayEquals(new int[] {0}, nums);
    }

    @Test
    public void test03() {
        int[] nums = new int[] {1,2,3,4,5};
        new MoveZeroes().moveZeroes(nums);
        Assert.assertArrayEquals(new int[] {1,2,3,4,5}, nums);
    }

    @Test
    public void test04() {
        int[] nums = new int[] {1,2,3,4,0};
        new MoveZeroes().moveZeroes(nums);
        Assert.assertArrayEquals(new int[] {1,2,3,4,0}, nums);
    }

    @Test
    public void test05() {
        int[] nums = new int[] {0,0,0,0};
        new MoveZeroes().moveZeroes(nums);
        Assert.assertArrayEquals(new int[] {0,0,0,0}, nums);
    }

    @Test
    public void test06() {
        int[] nums = new int[] {5};
        new MoveZeroes().moveZeroes(nums);
        Assert.assertArrayEquals(new int[] {5}, nums);
    }
}
