package prasad.leetcode.p31;

import org.junit.Assert;
import org.junit.Test;

public class NextPermutationTest {

    @Test
    public void test01() {
        int[] nums = new int[] {1,2,3};
        new NextPermutation().nextPermutation(nums);
        Assert.assertArrayEquals(new int[] {1,3,2}, nums);
    }

    @Test
    public void test02() {
        int[] nums = new int[] {3,2,1};
        new NextPermutation().nextPermutation(nums);
        Assert.assertArrayEquals(new int[] {1,2,3}, nums);
    }

    @Test
    public void test03() {
        int[] nums = new int[] {1,1,5};
        new NextPermutation().nextPermutation(nums);
        Assert.assertArrayEquals(new int[] {1,5,1}, nums);
    }

    @Test
    public void test04() {
        int[] nums = new int[] {1};
        new NextPermutation().nextPermutation(nums);
        Assert.assertArrayEquals(new int[] {1}, nums);
    }

    @Test
    public void test05() {
        int[] nums = new int[] {4,1,7,3,5,2,4,3,1,8,9,4,3,5};
        new NextPermutation().nextPermutation(nums);
        Assert.assertArrayEquals(new int[] {4,1,7,3,5,2,4,3,1,8,9,4,5,3}, nums);
    }

    @Test
    public void test06() {
        int[] nums = new int[] {4,1,7,3,5,2,4,3,1,8,9,4,3,1};
        new NextPermutation().nextPermutation(nums);
        Assert.assertArrayEquals(new int[] {4,1,7,3,5,2,4,3,1,9,1,3,4,8}, nums);
    }

    @Test
    public void test07() {
        int[] nums = new int[] {4,1,7,3,5,2,4,3,1,2,9,4,3,1};
        new NextPermutation().nextPermutation(nums);
        Assert.assertArrayEquals(new int[] {4,1,7,3,5,2,4,3,1,3,1,2,4,9}, nums);
    }
}
