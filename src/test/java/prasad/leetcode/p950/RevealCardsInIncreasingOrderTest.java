package prasad.leetcode.p950;

import org.junit.Assert;
import org.junit.Test;

public class RevealCardsInIncreasingOrderTest {

    @Test
    public void test01() {
        Assert.assertArrayEquals(new int[] {2,13,3,11,5,17,7},
                new RevealCardsInIncreasingOrder().deckRevealedIncreasing(new int[] {17,13,11,2,3,5,7}));
    }

    @Test
    public void test02() {
        Assert.assertArrayEquals(new int[] {1,1000},
                new RevealCardsInIncreasingOrder().deckRevealedIncreasing(new int[] {1,1000}));
    }

    @Test
    public void test03() {
        Assert.assertArrayEquals(new int[] {5},
                new RevealCardsInIncreasingOrder().deckRevealedIncreasing(new int[] {5}));
    }
}
