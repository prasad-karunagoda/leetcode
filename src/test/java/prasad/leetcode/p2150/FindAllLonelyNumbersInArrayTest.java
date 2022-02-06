package prasad.leetcode.p2150;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FindAllLonelyNumbersInArrayTest {

    @Test
    public void test01() {
        List<Integer> lonely = new FindAllLonelyNumbersInArray().findLonely(new int[] {10,6,5,8});
        Assert.assertEquals(2, lonely.size());
        Assert.assertTrue(lonely.containsAll(Arrays.asList(10,8)));
    }

    @Test
    public void test02() {
        List<Integer> lonely = new FindAllLonelyNumbersInArray().findLonely(new int[] {1,3,5,3});
        Assert.assertEquals(2, lonely.size());
        Assert.assertTrue(lonely.containsAll(Arrays.asList(1,5)));
    }

    @Test
    public void test03() {
        List<Integer> lonely = new FindAllLonelyNumbersInArray().findLonely(new int[] {5});
        Assert.assertEquals(1, lonely.size());
        Assert.assertEquals(5, lonely.get(0).intValue());
    }

    @Test
    public void test04() {
        List<Integer> lonely = new FindAllLonelyNumbersInArray().findLonely(new int[] {0});
        Assert.assertEquals(1, lonely.size());
        Assert.assertEquals(0, lonely.get(0).intValue());
    }

    @Test
    public void test05() {
        List<Integer> lonely = new FindAllLonelyNumbersInArray().findLonely(new int[] {1000000});
        Assert.assertEquals(1, lonely.size());
        Assert.assertEquals(1000000, lonely.get(0).intValue());
    }

    @Test
    public void testTime() {
        Random random = new Random();
        int[] nums = new int[100000];
        for (int i = 0; i < 100000; i++) {
            nums[i] = random.nextInt(1000001);
        }

        long start = System.currentTimeMillis();
        new FindAllLonelyNumbersInArray().findLonely(nums);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
