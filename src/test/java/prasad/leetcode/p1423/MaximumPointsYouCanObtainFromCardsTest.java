package prasad.leetcode.p1423;

import org.junit.Assert;
import org.junit.Test;

public class MaximumPointsYouCanObtainFromCardsTest {

    @Test
    public void test01() {
        Assert.assertEquals(12, new MaximumPointsYouCanObtainFromCards().maxScore(
                new int[] {1,2,3,4,5,6,1}, 3));
    }

    @Test
    public void test02() {
        Assert.assertEquals(4, new MaximumPointsYouCanObtainFromCards().maxScore(
                new int[] {2,2,2}, 2));
    }

    @Test
    public void test03() {
        Assert.assertEquals(55, new MaximumPointsYouCanObtainFromCards().maxScore(
                new int[] {9,7,7,9,7,7,9}, 7));
    }

    @Test
    public void test04() {
        Assert.assertEquals(5, new MaximumPointsYouCanObtainFromCards().maxScore(
                new int[] {5}, 1));
    }

    @Test
    public void test05() {
        Assert.assertEquals(26, new MaximumPointsYouCanObtainFromCards().maxScore(
                new int[] {8,5,2,6,4,6,7,2,3}, 5));
    }
}
