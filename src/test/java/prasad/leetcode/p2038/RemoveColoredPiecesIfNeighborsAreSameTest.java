package prasad.leetcode.p2038;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class RemoveColoredPiecesIfNeighborsAreSameTest {

    @Test
    public void test01() {
        Assert.assertTrue(new RemoveColoredPiecesIfNeighborsAreSame().winnerOfGame("AAABABB"));
    }

    @Test
    public void test02() {
        Assert.assertFalse(new RemoveColoredPiecesIfNeighborsAreSame().winnerOfGame("AA"));
    }

    @Test
    public void test03() {
        Assert.assertFalse(new RemoveColoredPiecesIfNeighborsAreSame().winnerOfGame("ABBBBBBBAAA"));
    }

    @Test
    public void test04() {
        Assert.assertFalse(new RemoveColoredPiecesIfNeighborsAreSame().winnerOfGame("ABBBABABABAAABBABAB"));
    }

    @Test
    public void testTime() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int n = 1; n <= 100000; n++) {
            sb.append(random.nextBoolean() ? 'A' : 'B');
        }

        long start = System.currentTimeMillis();
        new RemoveColoredPiecesIfNeighborsAreSame().winnerOfGame(sb.toString());
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
