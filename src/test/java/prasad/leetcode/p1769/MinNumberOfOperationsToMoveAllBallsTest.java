package prasad.leetcode.p1769;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class MinNumberOfOperationsToMoveAllBallsTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {1,1,3},
                new MinNumberOfOperationsToMoveAllBalls().minOperations("110"));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {11,8,5,4,3,4},
                new MinNumberOfOperationsToMoveAllBalls().minOperations("001011"));
    }

    @Test
    public void test03() {
        Assert.assertArrayEquals(new int[] {0},
                new MinNumberOfOperationsToMoveAllBalls().minOperations("0"));
    }

    @Test
    public void test04() {
        Assert.assertArrayEquals(new int[] {0},
                new MinNumberOfOperationsToMoveAllBalls().minOperations("1"));
    }

    @Test
    public void testTime() {
        Random random = new Random();
        String boxes = random.ints('0', '1' + 1)
                .limit(2000)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        System.out.println(boxes);
        long start = System.currentTimeMillis();
        new MinNumberOfOperationsToMoveAllBalls().minOperations(boxes);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
