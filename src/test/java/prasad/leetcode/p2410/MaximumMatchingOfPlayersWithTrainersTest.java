package prasad.leetcode.p2410;

import org.junit.Assert;
import org.junit.Test;

public class MaximumMatchingOfPlayersWithTrainersTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new MaximumMatchingOfPlayersWithTrainers().matchPlayersAndTrainers(
                new int[] {4,7,9}, new int[] {8,2,5,8}));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new MaximumMatchingOfPlayersWithTrainers().matchPlayersAndTrainers(
                new int[] {1,1,1}, new int[] {10}));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new MaximumMatchingOfPlayersWithTrainers().matchPlayersAndTrainers(
                new int[] {8}, new int[] {5}));
    }
}
