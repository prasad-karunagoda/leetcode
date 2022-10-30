package prasad.leetcode.p1629;

import org.junit.Assert;
import org.junit.Test;

public class SlowestKeyTest {

    @Test
    public void test01() {
        Assert.assertEquals('c', new SlowestKey().slowestKey(new int[] {9,29,49,50}, "cbcd"));
    }

    @Test
    public void test02() {
        Assert.assertEquals('a', new SlowestKey().slowestKey(new int[] {12,23,36,46,62}, "spuda"));
    }

    @Test
    public void test03() {
        Assert.assertEquals('k', new SlowestKey().slowestKey(new int[] {10,20}, "kk"));
    }
}
