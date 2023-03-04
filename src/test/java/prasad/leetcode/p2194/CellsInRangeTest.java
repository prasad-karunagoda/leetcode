package prasad.leetcode.p2194;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CellsInRangeTest {

    @Test
    public void test01() {
        List<String> result = new CellsInRange().cellsInRange("K1:L2");
        Assert.assertEquals(Arrays.asList("K1", "K2", "L1", "L2"), result);
    }

    @Test
    public void test02() {
        List<String> result = new CellsInRange().cellsInRange("A1:F1");
        Assert.assertEquals(Arrays.asList("A1", "B1", "C1", "D1", "E1", "F1"), result);
    }

    @Test
    public void test03() {
        List<String> result = new CellsInRange().cellsInRange("C1:C5");
        Assert.assertEquals(Arrays.asList("C1", "C2", "C3", "C4", "C5"), result);
    }

    @Test
    public void test04() {
        List<String> result = new CellsInRange().cellsInRange("E4:E4");
        Assert.assertEquals(Collections.singletonList("E4"), result);
    }
}
