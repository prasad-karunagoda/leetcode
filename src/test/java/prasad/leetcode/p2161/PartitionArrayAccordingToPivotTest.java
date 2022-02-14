package prasad.leetcode.p2161;

import org.junit.Assert;
import org.junit.Test;

public class PartitionArrayAccordingToPivotTest {

    @Test
    public void test01() {
        int[] rearranged = new PartitionArrayAccordingToPivot().pivotArray(new int[] {9,12,5,10,14,3,10}, 10);
        Assert.assertArrayEquals(new int[] {9,5,3,10,10,12,14}, rearranged);
    }

    @Test
    public void test02() {
        int[] rearranged = new PartitionArrayAccordingToPivot().pivotArray(new int[] {-3,4,3,2}, 2);
        Assert.assertArrayEquals(new int[] {-3,2,4,3}, rearranged);
    }

    @Test
    public void test03() {
        int[] rearranged = new PartitionArrayAccordingToPivot().pivotArray(new int[] {34,16,-15,20,41,27,-23,20,31,25,6,44}, 20);
        Assert.assertArrayEquals(new int[] {16,-15,-23,6,20,20,34,41,27,31,25,44}, rearranged);
    }
}
