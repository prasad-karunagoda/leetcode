package prasad.leetcode.p57;

import org.junit.Assert;
import org.junit.Test;

public class InsertIntervalTest {

    @Test
    public void test01() {
        int[][] intervals = new int[][] {{1,3}, {6,9}};
        int[][] resultingIntervals = new InsertInterval().insert(intervals, new int[] {2,5});
        Assert.assertEquals(2, resultingIntervals.length);
        Assert.assertArrayEquals(new int[] {1,5}, resultingIntervals[0]);
        Assert.assertArrayEquals(new int[] {6,9}, resultingIntervals[1]);
    }

    @Test
    public void test02() {
        int[][] intervals = new int[][] {{1,2}, {3,5}, {6,7}, {8,10}, {12,16}};
        int[][] resultingIntervals = new InsertInterval().insert(intervals, new int[] {4,8});
        Assert.assertEquals(3, resultingIntervals.length);
        Assert.assertArrayEquals(new int[] {1,2}, resultingIntervals[0]);
        Assert.assertArrayEquals(new int[] {3,10}, resultingIntervals[1]);
        Assert.assertArrayEquals(new int[] {12,16}, resultingIntervals[2]);
    }

    @Test
    public void test03() {
        int[][] intervals = new int[0][];
        int[][] resultingIntervals = new InsertInterval().insert(intervals, new int[] {5,7});
        Assert.assertEquals(1, resultingIntervals.length);
        Assert.assertArrayEquals(new int[] {5,7}, resultingIntervals[0]);
    }

    @Test
    public void test04() {
        int[][] intervals = new int[][] {{1,5}};
        int[][] resultingIntervals = new InsertInterval().insert(intervals, new int[] {2,3});
        Assert.assertEquals(1, resultingIntervals.length);
        Assert.assertArrayEquals(new int[] {1,5}, resultingIntervals[0]);
    }

    @Test
    public void test05() {
        int[][] intervals = new int[][] {{1,5}};
        int[][] resultingIntervals = new InsertInterval().insert(intervals, new int[] {2,7});
        Assert.assertEquals(1, resultingIntervals.length);
        Assert.assertArrayEquals(new int[] {1,7}, resultingIntervals[0]);
    }

    @Test
    public void test06() {
        int[][] intervals = new int[][] {{6,8}, {9,12}};
        int[][] resultingIntervals = new InsertInterval().insert(intervals, new int[] {2,4});
        Assert.assertEquals(3, resultingIntervals.length);
        Assert.assertArrayEquals(new int[] {2,4}, resultingIntervals[0]);
        Assert.assertArrayEquals(new int[] {6,8}, resultingIntervals[1]);
        Assert.assertArrayEquals(new int[] {9,12}, resultingIntervals[2]);
    }

    @Test
    public void test07() {
        int[][] intervals = new int[][] {{6,8}, {9,12}};
        int[][] resultingIntervals = new InsertInterval().insert(intervals, new int[] {15,17});
        Assert.assertEquals(3, resultingIntervals.length);
        Assert.assertArrayEquals(new int[] {6,8}, resultingIntervals[0]);
        Assert.assertArrayEquals(new int[] {9,12}, resultingIntervals[1]);
        Assert.assertArrayEquals(new int[] {15,17}, resultingIntervals[2]);
    }

    @Test
    public void test08() {
        int[][] intervals = new int[][] {{3,5}, {12,15}};
        int[][] resultingIntervals = new InsertInterval().insert(intervals, new int[] {6,6});
        Assert.assertEquals(3, resultingIntervals.length);
        Assert.assertArrayEquals(new int[] {3,5}, resultingIntervals[0]);
        Assert.assertArrayEquals(new int[] {6,6}, resultingIntervals[1]);
        Assert.assertArrayEquals(new int[] {12,15}, resultingIntervals[2]);
    }
}
