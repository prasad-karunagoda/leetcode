package prasad.leetcode.p2315;

import org.junit.Assert;
import org.junit.Test;

public class CountAsterisksTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new CountAsterisks().countAsterisks("l|*e*et|c**o|*de|"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new CountAsterisks().countAsterisks("iamprogrammer"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(5, new CountAsterisks().countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(3, new CountAsterisks().countAsterisks("i*am*programmer*"));
    }

    @Test
    public void test05() {
        Assert.assertEquals(0, new CountAsterisks().countAsterisks("||"));
    }
}
