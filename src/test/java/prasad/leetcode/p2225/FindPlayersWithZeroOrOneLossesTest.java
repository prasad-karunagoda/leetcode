package prasad.leetcode.p2225;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FindPlayersWithZeroOrOneLossesTest {

    @Test
    public void test01() {
        List<List<Integer>> result = new FindPlayersWithZeroOrOneLosses().findWinners(
                new int[][] {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}});
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(Arrays.asList(1,2,10), result.get(0));
        Assert.assertEquals(Arrays.asList(4,5,7,8), result.get(1));
    }

    @Test
    public void test02() {
        List<List<Integer>> result = new FindPlayersWithZeroOrOneLosses().findWinners(
                new int[][] {{2,3},{1,3},{5,4},{6,4}});
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(Arrays.asList(1,2,5,6), result.get(0));
        Assert.assertTrue(result.get(1).isEmpty());
    }

    @Test
    public void test03() {
        List<List<Integer>> result = new FindPlayersWithZeroOrOneLosses().findWinners(
                new int[][] {{2,3}});
        Assert.assertEquals(2, result.size());
        Assert.assertEquals(Collections.singletonList(2), result.get(0));
        Assert.assertEquals(Collections.singletonList(3), result.get(1));
    }

    @Test
    public void testTime() {
        int[][] matches = new int[100000][2];
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int winner = random.nextInt(100000) + 1;
            int loser = random.nextInt(100000) + 1;
            if (winner == loser) {
                if (winner == 1) {
                    loser = 2;
                }
                else {
                    loser = winner - 1;
                }
            }
            matches[i][0] = winner;
            matches[i][1] = loser;
        }

        long start = System.currentTimeMillis();
        List<List<Integer>> result = new FindPlayersWithZeroOrOneLosses().findWinners(matches);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
        Assert.assertEquals(2, result.size());
    }
}
