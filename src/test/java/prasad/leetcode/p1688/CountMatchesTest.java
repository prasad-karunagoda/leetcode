package prasad.leetcode.p1688;

import org.junit.Assert;
import org.junit.Test;

public class CountMatchesTest {

    @Test
    public void test() {
        CountMatches countMatches = new CountMatches();
        for (int n = 1; n <= 200; n++) {
            Assert.assertEquals(n - 1, countMatches.numberOfMatches(n));
        }
    }
}
