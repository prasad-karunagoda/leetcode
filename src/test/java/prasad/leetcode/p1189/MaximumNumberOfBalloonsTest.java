package prasad.leetcode.p1189;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberOfBalloonsTest {

    @Test
    public void test01() {
        Assert.assertEquals(1, new MaximumNumberOfBalloons().maxNumberOfBalloons("nlaebolko"));
    }

    @Test
    public void test02() {
        Assert.assertEquals(2, new MaximumNumberOfBalloons().maxNumberOfBalloons("loonbalxballpoon"));
    }

    @Test
    public void test03() {
        Assert.assertEquals(0, new MaximumNumberOfBalloons().maxNumberOfBalloons("leetcode"));
    }

    @Test
    public void test04() {
        Assert.assertEquals(1, new MaximumNumberOfBalloons().maxNumberOfBalloons("nlalebolko"));
    }

    @Test
    public void test05() {
        Assert.assertEquals(0, new MaximumNumberOfBalloons().maxNumberOfBalloons("nlaeblko"));
    }

    @Test
    public void test06() {
        Assert.assertEquals(1, new MaximumNumberOfBalloons().maxNumberOfBalloons("nlbaeboalko"));
    }
}
