package prasad.leetcode.p2028;

import org.junit.Assert;
import org.junit.Test;

public class FindMissingObservationsTest {

    @Test
    public void test01() {
        int[] missing = new FindMissingObservations().missingRolls(new int[] {3,2,4,3}, 4, 2);
        Assert.assertArrayEquals(new int[] {6,6}, missing);
    }

    @Test
    public void test02() {
        int[] missing = new FindMissingObservations().missingRolls(new int[] {1,5,6}, 3, 4);
        Assert.assertArrayEquals(new int[] {3,2,2,2}, missing);
    }

    @Test
    public void test03() {
        int[] missing = new FindMissingObservations().missingRolls(new int[] {1,2,3,4}, 6, 4);
        Assert.assertArrayEquals(new int[0], missing);
    }

    @Test
    public void test04() {
        int[] missing = new FindMissingObservations().missingRolls(new int[] {3}, 4, 1);
        Assert.assertArrayEquals(new int[] {5}, missing);
    }

    @Test
    public void test05() {
        int[] missing = new FindMissingObservations().missingRolls(new int[] {6,5,6,6}, 5, 3);
        Assert.assertArrayEquals(new int[] {4,4,4}, missing);
    }
}
