package prasad.leetcode.p1276;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NumberOfBurgersWithNoWasteTest {

    @Test
    public void test01() {
        List<Integer> counts = new NumberOfBurgersWithNoWaste().numOfBurgers(16, 7);
        Assert.assertEquals(Arrays.asList(1, 6), counts);
    }

    @Test
    public void test02() {
        List<Integer> counts = new NumberOfBurgersWithNoWaste().numOfBurgers(17, 4);
        Assert.assertTrue(counts.isEmpty());
    }

    @Test
    public void test03() {
        List<Integer> counts = new NumberOfBurgersWithNoWaste().numOfBurgers(4, 17);
        Assert.assertTrue(counts.isEmpty());
    }

    @Test
    public void test04() {
        List<Integer> counts = new NumberOfBurgersWithNoWaste().numOfBurgers(0, 0);
        Assert.assertEquals(Arrays.asList(0, 0), counts);
    }

    @Test
    public void test05() {
        List<Integer> counts = new NumberOfBurgersWithNoWaste().numOfBurgers(2385088, 164763);
        Assert.assertTrue(counts.isEmpty());
    }
}
