package prasad.leetcode.p2278;

import org.junit.Assert;
import org.junit.Test;

public class PercentageOfLetterInStringTest {

    @Test
    public void test01() {
        Assert.assertEquals(33, new PercentageOfLetterInString().percentageLetter("foobar", 'o'));
    }

    @Test
    public void test02() {
        Assert.assertEquals(0, new PercentageOfLetterInString().percentageLetter("jjjj", 'k'));
    }

    @Test
    public void test03() {
        Assert.assertEquals(42, new PercentageOfLetterInString().percentageLetter("foobaro", 'o'));
    }
}
