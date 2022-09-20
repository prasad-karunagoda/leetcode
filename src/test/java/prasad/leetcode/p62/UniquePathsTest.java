package prasad.leetcode.p62;

import org.junit.Assert;
import org.junit.Test;

public class UniquePathsTest {

    @Test
    public void test01() {
        Assert.assertEquals(28, new UniquePaths().uniquePaths(3, 7));
    }

    @Test
    public void test02() {
        Assert.assertEquals(3, new UniquePaths().uniquePaths(3, 2));
    }

    @Test
    public void test03() {
        Assert.assertEquals(1, new UniquePaths().uniquePaths(1, 1));
    }

    @Test
    public void test04() {
        Assert.assertEquals(30421755, new UniquePaths().uniquePaths(13, 17));
    }

    @Test
    public void test05() {
        Assert.assertEquals(225792840, new UniquePaths().uniquePaths(13, 21));
    }
}
