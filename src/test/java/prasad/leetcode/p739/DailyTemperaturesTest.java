package prasad.leetcode.p739;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class DailyTemperaturesTest {

    @Test
    public void test01() {
        int[] answer = new DailyTemperatures().dailyTemperatures(new int[] {73,74,75,71,69,72,76,73});
        Assert.assertArrayEquals(new int[] {1,1,4,2,1,1,0,0}, answer);
    }

    @Test
    public void test02() {
        int[] answer = new DailyTemperatures().dailyTemperatures(new int[] {30,40,50,60});
        Assert.assertArrayEquals(new int[] {1,1,1,0}, answer);
    }

    @Test
    public void test03() {
        int[] answer = new DailyTemperatures().dailyTemperatures(new int[] {30,60,90});
        Assert.assertArrayEquals(new int[] {1,1,0}, answer);
    }

    @Test
    public void test04() {
        int[] answer = new DailyTemperatures().dailyTemperatures(new int[] {30,30,90});
        Assert.assertArrayEquals(new int[] {2,1,0}, answer);
    }

    @Test
    public void test05() {
        int[] answer = new DailyTemperatures().dailyTemperatures(new int[] {30});
        Assert.assertArrayEquals(new int[] {0}, answer);
    }

    @Test
    public void test06() {
        int[] answer = new DailyTemperatures().dailyTemperatures(new int[] {40,30});
        Assert.assertArrayEquals(new int[] {0,0}, answer);
    }

    @Test
    public void testTime() {
        int[] temperatures = new int[100000];
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            temperatures[i] = 30 + random.nextInt(71);
        }

        long start = System.currentTimeMillis();
        new DailyTemperatures().dailyTemperatures(temperatures);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
