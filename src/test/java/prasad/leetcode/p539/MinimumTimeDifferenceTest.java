package prasad.leetcode.p539;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MinimumTimeDifferenceTest {

    @Test
    public void test01() {
        List<String> timePoints = Arrays.asList("23:59", "00:00");
        Assert.assertEquals(1, new MinimumTimeDifference().findMinDifference(timePoints));
    }

    @Test
    public void test02() {
        List<String> timePoints = Arrays.asList("00:00", "23:59", "00:00");
        Assert.assertEquals(0, new MinimumTimeDifference().findMinDifference(timePoints));
    }

    @Test
    public void test03() {
        List<String> timePoints = Arrays.asList("12:00", "00:00");
        Assert.assertEquals(12 * 60, new MinimumTimeDifference().findMinDifference(timePoints));
    }

    @Test
    public void test04() {
        List<String> timePoints = Arrays.asList("12:01", "00:00");
        Assert.assertEquals(12 * 60 - 1, new MinimumTimeDifference().findMinDifference(timePoints));
    }

    @Test
    public void test05() {
        List<String> timePoints = Arrays.asList("11:59", "00:00");
        Assert.assertEquals(12 * 60 - 1, new MinimumTimeDifference().findMinDifference(timePoints));
    }

    @Test
    public void test06() {
        List<String> timePoints = Arrays.asList("23:59", "00:00", "08:00");
        Assert.assertEquals(1, new MinimumTimeDifference().findMinDifference(timePoints));
    }
}
