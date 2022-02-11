package prasad.leetcode.p506;

import org.junit.Assert;
import org.junit.Test;

public class RelativeRanksTest {

    @Test
    public void test01() {
        String[] ranks = new RelativeRanks().findRelativeRanks(new int[] {5,4,3,2,1});
        Assert.assertArrayEquals(new String[] {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"}, ranks);
    }

    @Test
    public void test02() {
        String[] ranks = new RelativeRanks().findRelativeRanks(new int[] {10,3,8,9,4});
        Assert.assertArrayEquals(new String[] {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"}, ranks);
    }

    @Test
    public void test03() {
        String[] ranks = new RelativeRanks().findRelativeRanks(new int[] {5});
        Assert.assertArrayEquals(new String[] {"Gold Medal"}, ranks);
    }

    @Test
    public void test04() {
        String[] ranks = new RelativeRanks().findRelativeRanks(new int[] {5, 8});
        Assert.assertArrayEquals(new String[] {"Silver Medal", "Gold Medal"}, ranks);
    }

    @Test
    public void test05() {
        String[] ranks = new RelativeRanks().findRelativeRanks(new int[] {24,16,7,12,8,21});
        Assert.assertArrayEquals(new String[] {"Gold Medal", "Bronze Medal", "6", "4", "5", "Silver Medal"}, ranks);
    }
}
