package prasad.leetcode.p121;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void test01() {
        Assert.assertEquals(5, new BestTimeToBuyAndSellStock().maxProfit(new int[] {7,1,5,3,6,4}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new BestTimeToBuyAndSellStock().maxProfit(new int[] {7,6,4,3,1}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new BestTimeToBuyAndSellStock().maxProfit(new int[] {5}));
    }

    @Test
    public void test04() {
        Random random = new Random();
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = random.nextInt(10001);
        }
        //System.out.println(Arrays.toString(array));

        long start = System.currentTimeMillis();
        new BestTimeToBuyAndSellStock().maxProfit(array);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
