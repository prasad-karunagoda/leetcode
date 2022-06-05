package prasad.leetcode.p767;

import org.junit.Assert;
import org.junit.Test;

public class ReorganizeStringTest {

    @Test
    public void test01() {
        Assert.assertEquals("aba", new ReorganizeString().reorganizeString("aab"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("", new ReorganizeString().reorganizeString("aaab"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("pdpepfkmk", new ReorganizeString().reorganizeString("mkkppefpd"));
    }

    @Test
    public void test04() {
        Assert.assertEquals("pdpepfkmkn", new ReorganizeString().reorganizeString("mkkppnefpd"));
    }

    @Test
    public void test05() {
        Assert.assertEquals("kdkakbkckpdqdrds", new ReorganizeString().reorganizeString("ddddkkkkkpqrscba"));
    }

    @Test
    public void test06() {
        Assert.assertEquals("p", new ReorganizeString().reorganizeString("p"));
    }

    @Test
    public void test07() {
        Assert.assertEquals("", new ReorganizeString().reorganizeString("kkkabckk"));
    }
}
