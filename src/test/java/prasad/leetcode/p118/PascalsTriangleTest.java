package prasad.leetcode.p118;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangleTest {

    @Test
    public void test01() {
        List<List<Integer>> rows = new PascalsTriangle().generate(1);
        Assert.assertEquals(1, rows.size());
        Assert.assertEquals(Collections.singletonList(1), rows.get(0));
    }

    @Test
    public void test02() {
        List<List<Integer>> rows = new PascalsTriangle().generate(2);
        Assert.assertEquals(2, rows.size());
        Assert.assertEquals(Collections.singletonList(1), rows.get(0));
        Assert.assertEquals(Arrays.asList(1, 1), rows.get(1));
    }

    @Test
    public void test05() {
        List<List<Integer>> rows = new PascalsTriangle().generate(5);
        Assert.assertEquals(5, rows.size());
        Assert.assertEquals(Collections.singletonList(1), rows.get(0));
        Assert.assertEquals(Arrays.asList(1, 1), rows.get(1));
        Assert.assertEquals(Arrays.asList(1, 2, 1), rows.get(2));
        Assert.assertEquals(Arrays.asList(1, 3, 3, 1), rows.get(3));
        Assert.assertEquals(Arrays.asList(1, 4, 6, 4, 1), rows.get(4));
    }
}
