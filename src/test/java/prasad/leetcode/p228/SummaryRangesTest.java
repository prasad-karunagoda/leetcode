package prasad.leetcode.p228;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SummaryRangesTest {

    @Test
    public void test01() {
        List<String> ranges = new SummaryRanges().summaryRanges(new int[] {0,1,2,4,5,7});
        Assert.assertEquals(Arrays.asList("0->2", "4->5", "7"), ranges);
    }

    @Test
    public void test02() {
        List<String> ranges = new SummaryRanges().summaryRanges(new int[] {0,2,3,4,6,8,9});
        Assert.assertEquals(Arrays.asList("0", "2->4", "6", "8->9"), ranges);
    }

    @Test
    public void test03() {
        List<String> ranges = new SummaryRanges().summaryRanges(new int[0]);
        Assert.assertEquals(0, ranges.size());
    }

    @Test
    public void test04() {
        List<String> ranges = new SummaryRanges().summaryRanges(new int[] {5});
        Assert.assertEquals(Collections.singletonList("5"), ranges);
    }

    @Test
    public void test05() {
        List<String> ranges = new SummaryRanges().summaryRanges(new int[] {-5,5});
        Assert.assertEquals(Arrays.asList("-5", "5"), ranges);
    }

    @Test
    public void test06() {
        List<String> ranges = new SummaryRanges().summaryRanges(new int[] {1,2,3,4});
        Assert.assertEquals(Collections.singletonList("1->4"), ranges);
    }
}
