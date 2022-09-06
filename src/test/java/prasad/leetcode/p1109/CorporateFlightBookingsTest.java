package prasad.leetcode.p1109;

import org.junit.Assert;
import org.junit.Test;

public class CorporateFlightBookingsTest {

    @Test
    public void test01() {
        int[] totals = new CorporateFlightBookings().corpFlightBookings(new int[][] {{1,2,10},{2,3,20},{2,5,25}}, 5);
        Assert.assertArrayEquals(new int[] {10,55,45,25,25}, totals);
    }

    @Test
    public void test02() {
        int[] totals = new CorporateFlightBookings().corpFlightBookings(new int[][] {{1,2,10},{2,2,15}}, 2);
        Assert.assertArrayEquals(new int[] {10,25}, totals);
    }

    @Test
    public void test03() {
        int[] totals = new CorporateFlightBookings().corpFlightBookings(new int[][] {{1,1,5}}, 1);
        Assert.assertArrayEquals(new int[] {5}, totals);
    }
}
