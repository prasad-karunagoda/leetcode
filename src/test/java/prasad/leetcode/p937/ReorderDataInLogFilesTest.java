package prasad.leetcode.p937;

import org.junit.Assert;
import org.junit.Test;

public class ReorderDataInLogFilesTest {

    @Test
    public void test01() {
        String[] reordered = new ReorderDataInLogFiles().reorderLogFiles(new String[] {
                "dig1 8 1 5 1",
                "let1 art can",
                "dig2 3 6",
                "let2 own kit dig",
                "let3 art zero"});
        Assert.assertArrayEquals(new String[] {
                "let1 art can",
                "let3 art zero",
                "let2 own kit dig",
                "dig1 8 1 5 1",
                "dig2 3 6"}, reordered);
    }

    @Test
    public void test02() {
        String[] reordered = new ReorderDataInLogFiles().reorderLogFiles(new String[] {
                "a1 9 2 3 1",
                "g1 act car",
                "zo4 4 7",
                "ab1 off key dog",
                "a8 act zoo"});
        Assert.assertArrayEquals(new String[] {
                "g1 act car",
                "a8 act zoo",
                "ab1 off key dog",
                "a1 9 2 3 1",
                "zo4 4 7"}, reordered);
    }

    @Test
    public void test03() {
        String[] reordered = new ReorderDataInLogFiles().reorderLogFiles(new String[] {"a1 9 2 3 1"});
        Assert.assertArrayEquals(new String[] {"a1 9 2 3 1"}, reordered);
    }
}
