package prasad.leetcode.p1578;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Random;

public class MinimumTimeToMakeRopeColorfulTest {

    @Test
    public void testFindConsecutiveRanges01() {
        List<int[]> ranges = new MinimumTimeToMakeRopeColorful().findConsecutiveRanges("abaac");
        Assert.assertEquals(1, ranges.size());
        Assert.assertArrayEquals(new int[] {2, 3}, ranges.get(0));
    }

    @Test
    public void testFindConsecutiveRanges02() {
        List<int[]> ranges = new MinimumTimeToMakeRopeColorful().findConsecutiveRanges("abc");
        Assert.assertEquals(0, ranges.size());
    }

    @Test
    public void testFindConsecutiveRanges03() {
        List<int[]> ranges = new MinimumTimeToMakeRopeColorful().findConsecutiveRanges("aabaa");
        Assert.assertEquals(2, ranges.size());
        Assert.assertArrayEquals(new int[] {0, 1}, ranges.get(0));
        Assert.assertArrayEquals(new int[] {3, 4}, ranges.get(1));
    }

    @Test
    public void testFindConsecutiveRanges04() {
        List<int[]> ranges = new MinimumTimeToMakeRopeColorful().findConsecutiveRanges("aaabcddddeffghijkkk");
        Assert.assertEquals(4, ranges.size());
        Assert.assertArrayEquals(new int[] {0, 2}, ranges.get(0));
        Assert.assertArrayEquals(new int[] {5, 8}, ranges.get(1));
        Assert.assertArrayEquals(new int[] {10, 11}, ranges.get(2));
        Assert.assertArrayEquals(new int[] {16, 18}, ranges.get(3));
    }

    @Test
    public void testFindConsecutiveRanges05() {
        List<int[]> ranges = new MinimumTimeToMakeRopeColorful().findConsecutiveRanges("a");
        Assert.assertEquals(0, ranges.size());
    }

    @Test
    public void testFindConsecutiveRanges06() {
        List<int[]> ranges = new MinimumTimeToMakeRopeColorful().findConsecutiveRanges("aa");
        Assert.assertEquals(1, ranges.size());
        Assert.assertArrayEquals(new int[] {0, 1}, ranges.get(0));
    }

    @Test
    public void testMinCost01() {
        Assert.assertEquals(3, new MinimumTimeToMakeRopeColorful()
                .minCost("abaac", new int[] {1, 2, 3, 4, 5}));
    }

    @Test
    public void testMinCost02() {
        Assert.assertEquals(0, new MinimumTimeToMakeRopeColorful()
                .minCost("abc", new int[] {1, 2, 3}));
    }

    @Test
    public void testMinCost03() {
        Assert.assertEquals(2, new MinimumTimeToMakeRopeColorful()
                .minCost("aabaa", new int[] {1, 2, 3, 4, 1}));
    }

    @Test
    public void testMinCost04() {
        Assert.assertEquals(31, new MinimumTimeToMakeRopeColorful()
                .minCost("aaabcddddeffghijkkk", new int[] {3, 2, 5, 4, 1, 3, 7, 6, 5, 2, 6, 4, 3, 7, 2, 6, 5, 7, 3}));
        //                                                       a  a  a  b  c  d  d  d  d  e  f  f  g  h  i  j  k  k  k
    }

    @Test
    public void testMinCostTime() {
        int[] neededTime = new int[100000];
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            char c = (char) ('a' + random.nextInt(26));
            sb.append(c);
            neededTime[i] = random.nextInt(10000) + 1;
        }
        long start = System.currentTimeMillis();
        new MinimumTimeToMakeRopeColorful().minCost(sb.toString(), neededTime);
        System.out.println("Time = " + (System.currentTimeMillis() - start) + " ms");
    }
}
