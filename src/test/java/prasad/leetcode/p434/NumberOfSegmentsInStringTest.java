package prasad.leetcode.p434;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfSegmentsInStringTest {

    @Test
    public void test01() {
        Assert.assertEquals(5, new NumberOfSegmentsInString().countSegments("Hello, my name is John"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(1, new NumberOfSegmentsInString().countSegments("Hello"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(4, new NumberOfSegmentsInString().countSegments("love live! mu'sic forever"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(0, new NumberOfSegmentsInString().countSegments(""));
    }

    @Test
    public void test05() {
        Assert.assertEquals(1, new NumberOfSegmentsInString().countSegments("Hello  "));
    }

    @Test
    public void test06() {
        Assert.assertEquals(1, new NumberOfSegmentsInString().countSegments("  Hello"));
    }

    @Test
    public void test07() {
        Assert.assertEquals(2, new NumberOfSegmentsInString().countSegments("  Hello  world  "));
    }

    @Test
    public void test08() {
        Assert.assertEquals(0, new NumberOfSegmentsInString().countSegments(" "));
    }
}
