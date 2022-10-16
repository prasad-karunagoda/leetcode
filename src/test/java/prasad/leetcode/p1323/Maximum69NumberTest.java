package prasad.leetcode.p1323;

import org.junit.Assert;
import org.junit.Test;

public class Maximum69NumberTest {

    @Test
    public void test01() {
        Assert.assertEquals(9969, new Maximum69Number().maximum69Number(9669));
    }

    @Test
    public void test02() {
        Assert.assertEquals(9999, new Maximum69Number().maximum69Number(9996));
    }

    @Test
    public void test03() {
        Assert.assertEquals(9999, new Maximum69Number().maximum69Number(9999));
    }

    @Test
    public void test04() {
        Assert.assertEquals(9, new Maximum69Number().maximum69Number(6));
    }
}
