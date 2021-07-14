package prasad.leetcode.p56;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsTest {

    @Test
    public void testMergeTwoIntervals01() {
        int[] merged = new MergeIntervals().mergeTwoIntervals(new int[] {1, 5}, new int[] {7, 9});
        Assert.assertNull(merged);
    }

    @Test
    public void testMergeTwoIntervals02() {
        int[] merged = new MergeIntervals().mergeTwoIntervals(new int[] {7, 9}, new int[] {1, 5});
        Assert.assertNull(merged);
    }

    @Test
    public void testMergeTwoIntervals03() {
        int[] merged = new MergeIntervals().mergeTwoIntervals(new int[] {1, 5}, new int[] {3, 9});
        Assert.assertArrayEquals(new int[] {1, 9}, merged);
    }

    @Test
    public void testMergeTwoIntervals04() {
        int[] merged = new MergeIntervals().mergeTwoIntervals(new int[] {6, 9}, new int[] {2, 7});
        Assert.assertArrayEquals(new int[] {2, 9}, merged);
    }

    @Test
    public void testMergeTwoIntervals05() {
        int[] merged = new MergeIntervals().mergeTwoIntervals(new int[] {2, 9}, new int[] {4, 6});
        Assert.assertArrayEquals(new int[] {2, 9}, merged);
    }

    @Test
    public void testMergeTwoIntervals06() {
        int[] merged = new MergeIntervals().mergeTwoIntervals(new int[] {5, 7}, new int[] {3, 8});
        Assert.assertArrayEquals(new int[] {3, 8}, merged);
    }

    @Test
    public void testMergeTwoIntervals07() {
        int[] merged = new MergeIntervals().mergeTwoIntervals(new int[] {2, 5}, new int[] {5, 7});
        Assert.assertArrayEquals(new int[] {2, 7}, merged);
    }

    @Test
    public void testMergeTwoIntervals08() {
        int[] merged = new MergeIntervals().mergeTwoIntervals(new int[] {6, 9}, new int[] {3, 6});
        Assert.assertArrayEquals(new int[] {3, 9}, merged);
    }

    @Test
    public void testMergeTwoIntervals09() {
        int[] merged = new MergeIntervals().mergeTwoIntervals(new int[] {4, 7}, new int[] {4, 7});
        Assert.assertArrayEquals(new int[] {4, 7}, merged);
    }


    @Test
    public void testMerge01() {
        int[][] mergedIntervals = new MergeIntervals().merge(new int[][] {{1,3}, {2,6}, {8,10}, {15,18}});
        Assert.assertEquals(3, mergedIntervals.length);

        List<List<Integer>> intervalList = new ArrayList<>();
        for (int i = 0; i < mergedIntervals.length; i++) {
            intervalList.add(Arrays.asList(mergedIntervals[i][0], mergedIntervals[i][1]));
        }

        Assert.assertTrue(intervalList.contains(Arrays.asList(1,6)));
        Assert.assertTrue(intervalList.contains(Arrays.asList(8,10)));
        Assert.assertTrue(intervalList.contains(Arrays.asList(15,18)));
    }

    @Test
    public void testMerge02() {
        int[][] mergedIntervals = new MergeIntervals().merge(new int[][] {{1,4}, {4,5}});
        Assert.assertEquals(1, mergedIntervals.length);
        Assert.assertEquals(1, mergedIntervals[0][0]);
        Assert.assertEquals(5, mergedIntervals[0][1]);
    }

    @Test
    public void testMerge03() {
        int[][] mergedIntervals = new MergeIntervals().merge(new int[][] {{1,4}, {1,4}});
        Assert.assertEquals(1, mergedIntervals.length);
        Assert.assertEquals(1, mergedIntervals[0][0]);
        Assert.assertEquals(4, mergedIntervals[0][1]);
    }

    @Test
    public void testMerge04() {
        int[][] mergedIntervals = new MergeIntervals().merge(new int[][] {{1,4}});
        Assert.assertEquals(1, mergedIntervals.length);
        Assert.assertEquals(1, mergedIntervals[0][0]);
        Assert.assertEquals(4, mergedIntervals[0][1]);
    }
}
