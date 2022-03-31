package prasad.leetcode.p1796;

import org.junit.Assert;
import org.junit.Test;

public class SecondLargestDigitInStringTest {

    @Test
    public void test01() {
        Assert.assertEquals(2, new SecondLargestDigitInString().secondHighest("dfa12321afd"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(-1, new SecondLargestDigitInString().secondHighest("abc1111"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(-1, new SecondLargestDigitInString().secondHighest("abcd"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(-1, new SecondLargestDigitInString().secondHighest("ab5cd"));
    }

    @Test
    public void test05() {
        Assert.assertEquals(5, new SecondLargestDigitInString().secondHighest("ab3c5def7gh"));
    }

    @Test
    public void test06() {
        Assert.assertEquals(5, new SecondLargestDigitInString().secondHighest("ab7c5def3gh"));
    }
}
