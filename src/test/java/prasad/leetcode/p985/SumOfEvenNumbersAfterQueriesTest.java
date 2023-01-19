package prasad.leetcode.p985;

import org.junit.Assert;
import org.junit.Test;

public class SumOfEvenNumbersAfterQueriesTest {

    @Test
    public void test01() {
        int[] result = new SumOfEvenNumbersAfterQueries().sumEvenAfterQueries(
                new int[] {1,2,3,4}, new int[][] {{1,0},{-3,1},{-4,0},{2,3}});
        Assert.assertArrayEquals(new int[] {8,6,2,4}, result);
    }

    @Test
    public void test02() {
        int[] result = new SumOfEvenNumbersAfterQueries().sumEvenAfterQueries(
                new int[] {1}, new int[][] {{4,0}});
        Assert.assertArrayEquals(new int[] {0}, result);
    }
}
