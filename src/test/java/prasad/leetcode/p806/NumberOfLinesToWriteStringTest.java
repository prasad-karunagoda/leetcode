package prasad.leetcode.p806;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfLinesToWriteStringTest {

    @Test
    public void test01() {
        int[] result = new NumberOfLinesToWriteString().numberOfLines(
                new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                "abcdefghijklmnopqrstuvwxyz");
        Assert.assertArrayEquals(new int[] {3, 60}, result);
    }

    @Test
    public void test02() {
        int[] result = new NumberOfLinesToWriteString().numberOfLines(
                new int[] {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                "bbbcccdddaaa");
        Assert.assertArrayEquals(new int[] {2, 4}, result);
    }

    @Test
    public void test03() {
        int[] result = new NumberOfLinesToWriteString().numberOfLines(
                new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                "p");
        Assert.assertArrayEquals(new int[] {1, 10}, result);
    }

    @Test
    public void test04() {
        int[] result = new NumberOfLinesToWriteString().numberOfLines(
                new int[] {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                "abcdefghij");
        Assert.assertArrayEquals(new int[] {1, 100}, result);
    }

    @Test
    public void test05() {
        int[] result = new NumberOfLinesToWriteString().numberOfLines(
                new int[] {10,10,10,10,10,10,10,10,10,10,5,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
                "abcdefghijk");
        Assert.assertArrayEquals(new int[] {2, 5}, result);
    }
}
