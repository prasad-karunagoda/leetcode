package prasad.leetcode.p1374;

import org.junit.Assert;
import org.junit.Test;

public class GenerateStringWithCharactersThatHaveOddCountsTest {

    @Test
    public void testOdd() {
        Assert.assertEquals("abccccc", new GenerateStringWithCharactersThatHaveOddCounts().generateTheString(7));
    }

    @Test
    public void testEven() {
        Assert.assertEquals("abbbbb", new GenerateStringWithCharactersThatHaveOddCounts().generateTheString(6));
    }

    @Test
    public void testOne() {
        Assert.assertEquals("a", new GenerateStringWithCharactersThatHaveOddCounts().generateTheString(1));
    }

    @Test
    public void testTwo() {
        Assert.assertEquals("ab", new GenerateStringWithCharactersThatHaveOddCounts().generateTheString(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZero() {
        new GenerateStringWithCharactersThatHaveOddCounts().generateTheString(0);
    }
}
