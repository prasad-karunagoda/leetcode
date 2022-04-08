package prasad.leetcode.p1138;

import org.junit.Assert;
import org.junit.Test;

public class AlphabetBoardPathTest {

    @Test
    public void test01() {
        Assert.assertEquals("RDD!RRRUU!!DDD!", new AlphabetBoardPath().alphabetBoardPath("leet"));
    }

    @Test
    public void test02() {
        Assert.assertEquals("RR!RRDD!LUU!R!", new AlphabetBoardPath().alphabetBoardPath("code"));
    }

    @Test
    public void test03() {
        Assert.assertEquals("RRDD!LLDDD!UUUURRR!", new AlphabetBoardPath().alphabetBoardPath("mzi"));
    }
}
