package prasad.leetcode.p1170;

import org.junit.Assert;
import org.junit.Test;

public class CompareFrequencyOfSmallestCharTest {

    @Test
    public void testFrequencyOfSmallestChar01() {
        Assert.assertEquals(2, new CompareFrequencyOfSmallestChar().frequencyOfSmallestChar("dcce"));
    }

    @Test
    public void testFrequencyOfSmallestChar02() {
        Assert.assertEquals(4, new CompareFrequencyOfSmallestChar().frequencyOfSmallestChar("bbbb"));
    }

    @Test
    public void testFrequencyOfSmallestChar03() {
        Assert.assertEquals(1, new CompareFrequencyOfSmallestChar().frequencyOfSmallestChar("k"));
    }

    @Test
    public void testNumSmallerByFrequency01() {
        int[] answers = new CompareFrequencyOfSmallestChar().numSmallerByFrequency(
                new String[] {"cbd"}, new String[] {"zaaaz"});
        Assert.assertArrayEquals(new int[] {1}, answers);
    }

    @Test
    public void testNumSmallerByFrequency02() {
        int[] answers = new CompareFrequencyOfSmallestChar().numSmallerByFrequency(
                new String[] {"bbb", "cc"}, new String[] {"a", "aa", "aaa", "aaaa"});
        Assert.assertArrayEquals(new int[] {1, 2}, answers);
    }

    @Test
    public void testNumSmallerByFrequency03() {
        int[] answers = new CompareFrequencyOfSmallestChar().numSmallerByFrequency(
                new String[] {"ghkrbkeudbhe", "hecktlcyscw"}, new String[] {"hargtgw", "davrtahj", "wdaftaajuy", "afewafbgaagrt"});
        Assert.assertArrayEquals(new int[] {2, 1}, answers);
    }

    @Test
    public void testNumSmallerByFrequency04() {
        int[] answers = new CompareFrequencyOfSmallestChar().numSmallerByFrequency(
                new String[] {"bbb"}, new String[] {"a", "aa", "aaa"});
        Assert.assertArrayEquals(new int[] {0}, answers);
    }
}
