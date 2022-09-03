package prasad.leetcode.p1535;

import org.junit.Assert;
import org.junit.Test;

public class FindTheWinnerOfArrayGameTest {

    @Test
    public void test01() {
        Assert.assertEquals(5, new FindTheWinnerOfArrayGame().getWinner(new int[] {2,1,3,5,4,6,7}, 2));
    }

    @Test
    public void test02() {
        Assert.assertEquals(3, new FindTheWinnerOfArrayGame().getWinner(new int[] {3,2,1}, 10));
    }

    @Test
    public void test03() {
        long start = System.currentTimeMillis();
        Assert.assertEquals(99, new FindTheWinnerOfArrayGame().getWinner(new int[] {1,11,22,33,44,55,66,77,88,99}, 1000000000));
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
